
package funciones;
import consultas.Consu_Abast;
import consultas.Consu_ProdCate;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class func_Abast {
    private Consu_ProdCate obj_Consu_ProdCate;
    private Consu_Abast obj_Consu_Abast;
    public func_Abast()
    {
        obj_Consu_ProdCate=new Consu_ProdCate();
        obj_Consu_Abast=new Consu_Abast();
    }
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
        tabla.setModel(modelo);
        
        
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
                valores[3]="Agotada";
                }
                if(cantidad<10){
                    valores[3]="Se Requiere Abasteciminto";
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
            


}