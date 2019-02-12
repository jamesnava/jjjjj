/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import consultas.Consu_ProdCate;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author NAVARRO
 */
public class func_ProdCate {
    Consu_ProdCate obj_Consu_ProdCate;
public func_ProdCate(){
    obj_Consu_ProdCate=new Consu_ProdCate();
}
public void insertarProducto(String codigo,String nombre,String descripcion,String color,String tamaño,String nomb_cate, String dni_usuario, String marca){
    ResultSet rsCategoria,rsMarca;
    int idMarca=0;
    String codigo_categoria="";
    rsCategoria=obj_Consu_ProdCate.RetornaCategoria(nomb_cate);
    rsMarca=obj_Consu_ProdCate.RetornaMarca(marca);
    try {
        while (rsMarca.next()) { 
            idMarca=rsMarca.getInt("idMarca");
            
        }
        while(rsCategoria.next()){
            codigo_categoria=rsCategoria.getString("codigoCategoria");
        }
    } catch (Exception e) {
    }
   String valor= obj_Consu_ProdCate.InsertarProducto(codigo, nombre, descripcion, color, tamaño, codigo_categoria, dni_usuario, idMarca);
   if(valor.equals("CORRECTO")){
       JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
   }
   else{
       JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
   }
}
public void ActualizarProducto(String codigo,String nombre,String descripcion,String color,String tamaño,String nomb_cate, String dni_usuario, String marca){
    ResultSet rsCategoria,rsMarca;
    int idMarca=0;
    String codigo_categoria="";
    rsCategoria=obj_Consu_ProdCate.RetornaCategoria(nomb_cate);
    rsMarca=obj_Consu_ProdCate.RetornaMarca(marca);
    try {
        while (rsMarca.next()) { 
            idMarca=rsMarca.getInt("idMarca");
            
        }
        while(rsCategoria.next()){
            codigo_categoria=rsCategoria.getString("codigoCategoria");
        }
    } catch (Exception e) {
    }
   String valor= obj_Consu_ProdCate.ActualizarProducto(codigo, nombre, descripcion, color, tamaño, codigo_categoria, dni_usuario, idMarca);
   if(valor.equals("CORRECTO")){
       JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
   }
   else{
       JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ALTUALIZAR");
   }
}
//:::::::::::::::::::::::::CATEGORIA::::::::::::::::::::::::::::::::::::::
public void InsertarCategoria(String codigoCate,String nombreCategoria,String descripcionCate){
    String valor=obj_Consu_ProdCate.InsertarCategoria(nombreCategoria, codigoCate, descripcionCate);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
    }
}
public void ActualizarCategoria(String codigoCate,String nombreCategoria,String descripcionCate){
    
    String valor=obj_Consu_ProdCate.ActualizarCategoria(nombreCategoria, codigoCate, descripcionCate);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ALTUALIZAR");
    }
}

//:::::::::::::::::::::::::FIN CATEGORIA::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::IGV::::::::::::::::::::::::::::::::::::::::::::
public void InsertarIgv(String codigo_igv,int porcentaje,String descripcion,String año){
      String valor=obj_Consu_ProdCate.InsertarIgv(codigo_igv,porcentaje,descripcion,año);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
    }
    
}
public void ActualizarIgv(String codigo_igv,int porcentaje,String descripcion,String año){
       String valor=obj_Consu_ProdCate.ActualizarIGV(codigo_igv,porcentaje,descripcion,año);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ACTUALIZAR");
    }
    
    
}
//:::::::::::::::::::::::::FIN IGV::::::::::::::::::::::::::::::::::::::::
    
}
