
package funciones;
import consultas.Consu_Abast;
import consultas.Consu_ProdCate;
import consultas.Consu_tien;
import java.awt.Color;
import java.awt.Image;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class func_Abast {
    private Consu_ProdCate obj_Consu_ProdCate;
    private Consu_Abast obj_Consu_Abast;
    private Consu_tien obj_Consu_tien;
    public func_Abast()
    {
        obj_Consu_ProdCate=new Consu_ProdCate();
        obj_Consu_Abast=new Consu_Abast();
        obj_Consu_tien=new Consu_tien();
    }
    // public llenar a la base de datos abastecimiento...
    public void insertarAbastecimiento(int codigo,String fecha,float monto,String RucProveedor,String usuario){
        String valor=obj_Consu_Abast.InsertarAbastecimiento(codigo, fecha, monto, RucProveedor, usuario);
        if(valor.equals("CORRECTO")){
            
        }
        else{
            JOptionPane.showMessageDialog(null,"error!!");
        }
        
       
    }
    public void insertarDetalleAbastecimiento(JTable tabla,int codigoDetalle,int codigoAbast,String codigoSede){
        int row=tabla.getRowCount();
        int idDetalle=codigoDetalle;
        //insertar stock
        
        for(int i=0;i<row;i++){
            
            int cantidadProducto=Integer.parseInt(tabla.getValueAt(i, 3).toString());
            
            String producto=tabla.getValueAt(i,1).toString();
            float importe=Float.parseFloat(tabla.getValueAt(i,4).toString());
            idDetalle=idDetalle+1;
            
            String codigoProducto=tabla.getValueAt(i,5).toString();
            //Stock
            boolean consulta=obj_Consu_Abast.ConsultaInsertoAlmacen(codigoSede, codigoProducto);
            System.err.println(consulta);
            if(consulta){
                int CantidadEnAlmacen=obj_Consu_Abast.RetornarStock(codigoSede, codigoProducto);
                
                obj_Consu_Abast.ActualizarStock(CantidadEnAlmacen+cantidadProducto, codigoSede, codigoProducto);
            }
            else{
                int idStock=obj_Consu_Abast.RetornarIdMaximoStock();
                obj_Consu_Abast.InsertarStock(idStock+1,cantidadProducto, codigoAbast, codigoSede, codigoProducto);
                
            }
            
            obj_Consu_Abast.InsertarDetalleAbastecimiento(cantidadProducto,producto,importe, idDetalle,codigoAbast,codigoProducto);
        }
        
        
        
    }
    
    public int retornarIdMaximo(){
        
       return obj_Consu_Abast.retornarIdMaximoAbastecimiento();
       
    }
    // retornar id detallemaximo
      public int retornarIdMaximoDetalle(){
       return obj_Consu_Abast.RetornarIdMaximoDetalleAbastecimiento();
    }
    
    //llenar a la base de datos abastecimiento fin
    public void LlenarTablaProductos(DefaultTableModel modelo){
        modelo.setRowCount(0);
        Object[] valores=new Object[4];
        ResultSet rs=obj_Consu_ProdCate.ConsultaProducto();
        
        String codigo="";
        try {
            while(rs.next()){
                
                codigo=rs.getString("codi_barr_prod");
                valores[0]=codigo;
                valores[1]=rs.getString("nomb_prod");
                ResultSet resulPrecio=obj_Consu_Abast.RetornarPrecios(codigo);
                while(resulPrecio.next()){
                valores[2]=resulPrecio.getFloat("prec_vent");
                valores[3]=resulPrecio.getFloat("prec_comp");
                }
                
               
                modelo.addRow(valores);
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
       
        
    }
    
    //llenar combo sede en la ventana inter inter agre abastecimiento
    public void LlenarComboSede(JComboBox combo){
        combo.removeAllItems();
        ResultSet rs=obj_Consu_tien.RetornarNombreSede();
        try {
            while(rs.next()){
                combo.addItem(rs.getString("sedes"));
            }
        } catch (Exception e) {
            
        }
        
        
    }
    // 
    
    public void BusquedaKeyPressed(String valor,DefaultTableModel modelo){
        ResultSet rs=obj_Consu_ProdCate.ConsultaProductoLike(valor);
        modelo.setRowCount(0);
        String codigo="";
        Object[] valores=new Object[4];
        try {
            while(rs.next()){
            codigo=rs.getString("codi_barr_prod");
            valores[0]=codigo;
            valores[1]=rs.getString("nomb_prod");
                ResultSet resulPrecio=obj_Consu_Abast.RetornarPrecios(codigo);
                while(resulPrecio.next()){
                valores[2]=resulPrecio.getFloat("prec_vent");
                valores[3]=resulPrecio.getFloat("prec_comp");
                }
                
               
                modelo.addRow(valores);
            
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
       
      
                
    }
    public void LlenarTablaEnviar(JTable tabla,DefaultTableModel modelo, int cantidad){
        // eliminar la fila...
        
        
        
        
        int row=tabla.getSelectedRow();
        //System.out.println("valor "+row);
        Object[] valores=new Object[5];
        String codigo=tabla.getValueAt(row,0).toString();
        
       
        // llenar...
        valores[0]=codigo;
        valores[1]=tabla.getValueAt(row,1);
        valores[2]=tabla.getValueAt(row,2);
        valores[3]=cantidad;
        float precio=Float.parseFloat(tabla.getValueAt(row,2).toString());
        valores[4]=precio*cantidad;
       
       // System.out.println(precio);
        modelo.addRow(valores);
        ///tabla.setModel(modelo);
        
        
    }
    public int ComprobarFila(JTable tabla,String codigo){
        
        int valorRetornar=-1;
        int n=0;
        while(n<tabla.getRowCount()){
            if(codigo.equals(tabla.getValueAt(n, 0))){
                valorRetornar=n;
            }
            n++;
        }
        return valorRetornar;
    }
    //::::::::::::::::::::::::::::::::::::::Stock:::::::::::::::::::::::::::::::::
    public void Stock(DefaultTableModel modelo){
        modelo.removeRow(0);
        ResultSet rs=obj_Consu_Abast.consultaStockPorAlmacen();
        Object valores[]=new Object[4];
       
        try {
             int cantidad=0;
             String codigoProducto="";
             String nombre="";
            while(rs.next()){
                cantidad=rs.getInt("cant_ingr");
                codigoProducto=rs.getString("codi_barr_prod");
               
               nombre=obj_Consu_ProdCate.ConsultaProductoPorcodigo(codigoProducto);
                System.out.println("nombreeee: "+nombre);              
                
                
                
                
                valores[0]=codigoProducto;
                valores[1]=nombre;
                valores[2]=cantidad;
                if(cantidad==0){
                valores[3]="Agotada!!";
                }
                if(cantidad<10 && cantidad>0){
                    valores[3]="Se Requiere Abastecimiento!";
                }
                
                //ingresando valores al modelo
                modelo.addRow(valores);
                
            }
        } catch (SQLException e) {
            System.out.println(e);   
        }
        
        
        
    }
    
        
    
    //:::::::::::::::::::::::::::::almacen::::::::::::::::::::::::::::::::::::::::
        //llenar comboAlmacen.:::::::::::
    public void LlenarComboAlmacen(JComboBox combo){
        combo.removeAllItems();
        ResultSet rs=obj_Consu_Abast.ConsultaAlmacen();
        try {
            while(rs.next()){
            combo.addItem(rs.getString("nomb_almacen"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void InsertarStockAlmacen(int codigo,int cantidad,int codigoAbastecimiento,String codigoSede,String codigoProducto){
        obj_Consu_Abast.InsertarStock(codigo+1, cantidad, codigoAbastecimiento, codigoSede, codigoProducto);
        
    }
    public int RetornarIdMaximoStock(){
        return obj_Consu_Abast.RetornarIdMaximoStock();
    }
    
    // pintar el logo empresa....
    public void PintarLogoGuia(JLabel label,String ruc){
        func_imagen obj_image=new func_imagen();
        Blob blob=null;
        ResultSet rs=obj_Consu_tien.RetornarLogoTienda(ruc);
        try {
            while(rs.next()){
                blob=rs.getBlob("logo");
            }
           
        } catch (SQLException e) {
            System.out.println(e);
        }
         Image img=obj_image.RetornarImagen(blob);
         ImageIcon icon=new ImageIcon(img.getScaledInstance(200,94,Image.SCALE_SMOOTH));
         label.setIcon(icon);
    }


}