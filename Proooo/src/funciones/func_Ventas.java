
package funciones;

import consultas.Consu_Abast;
import consultas.Consu_ProdCate;
import consultas.Consu_Ventas;
import consultas.Consu_tien;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class func_Ventas {
 Consu_Ventas obj_Consu_Ventas;
 Consu_Abast obj_Consu_Abast;
 Consu_ProdCate obj_Consu_ProdCate;
 public func_Ventas(){
     obj_Consu_Ventas=new Consu_Ventas();
     obj_Consu_Abast=new Consu_Abast();
     obj_Consu_ProdCate=new Consu_ProdCate();
 }
public void LlenarTablaProductoVenta(String nombre, JTable tabla,String Sede){
    Consu_tien obj_Consu_tien=new Consu_tien();
    // consultando id sede...
    String codigoSede=obj_Consu_tien.RetornarCodigoSede(Sede);
    //fin
    ResultSet rs=obj_Consu_Ventas.ConsultaProductoLike(nombre);
    
    DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
                      modelo.setRowCount(0);
    Object valores[]=new Object[4];
    try {
        while(rs.next()){
            String codigoProducto=rs.getString("codi_barr_prod");
            String producto=rs.getString("nomb_prod");
            // consulta stock...
            ResultSet resultado=obj_Consu_Ventas.ComprobarStockProducto(codigoProducto,codigoSede);
            int cantidad=0;
                while(resultado.next()){
                    cantidad=resultado.getInt("cant_ingr");
                    
                }
                //consultamos Precio...
                if(cantidad>0){
                int Precio=obj_Consu_Ventas.PrecioProducto(codigoProducto);
                valores[0]=codigoProducto;
                valores[1]=producto;
                valores[2]=Precio;
                valores[3]=cantidad;
                modelo.addRow(valores);
                }
               
                            
        }
        tabla.setModel(modelo);
    } catch (SQLException e) {
        System.out.println(e);
    }
}

public void llenarTablaProductoVentaInicial(JTable tabla,String sede){
    Consu_tien obj_Consu_tien=new Consu_tien();
    // consultando id sede...
    String codigoSede=obj_Consu_tien.RetornarCodigoSede(sede);
    
    // consultando Productos de una sede...
   ResultSet rs= obj_Consu_Abast.consultaStockPorAlmacen(codigoSede);
   //optencion del modelo
   DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
                    modelo.setRowCount(0);
   Object [] valores=new Object[4];
    try {
        while(rs.next()){
                 String codigoProducto=rs.getString("codi_barr_prod");
                 int cantidad=rs.getInt("cant_ingr");
                 if(cantidad>0){
                     String Producto=obj_Consu_ProdCate.ConsultaProductoPorcodigo(codigoProducto);
                     int precio=obj_Consu_Ventas.PrecioProducto(codigoProducto);
                     valores[0]=codigoProducto;
                     valores[1]=Producto;
                     valores[2]=precio;
                     valores[3]=cantidad;
                     modelo.addRow(valores);
                     
                 }
                 tabla.setModel(modelo);
         }
    } catch (SQLException e) {
            System.err.println(e);
    }
   
}
public void PasarDatosEntreTablas(JTable tabla1,JTable tabla2, int cantidad){
   int row=tabla1.getSelectedRow();
    DefaultTableModel modelo2=(DefaultTableModel)tabla2.getModel();
    Object [] valores=new Object[4];
    float precio=Float.parseFloat(tabla1.getValueAt(row,2).toString());
    valores[0]=tabla1.getValueAt(row,0);
    valores[1]=tabla1.getValueAt(row,1);
    valores[2]=precio;
    valores[3]=precio*cantidad;
    modelo2.addRow(valores);
    tabla2.setModel(modelo2);
}
    
}
