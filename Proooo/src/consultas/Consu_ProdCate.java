/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NAVARRO
 */
public class Consu_ProdCate {
    Connection con;
    conectar optener;
 public Consu_ProdCate(){
     optener=new conectar();
     con=optener.getConectar();
 }
 //::::::::::::::::::::::::::producto:::::::::::::::::::::::::::::::::
 public String InsertarProducto(String codigo_barra,String nombre,String descripcion,String color,String tamaño,String codigo_categoria,String dni_usua,int codi_marca){
     String estado="INCORRECTO";
     try {
         String sql="CALL InsertarProducto('"+codigo_barra+"','"+nombre+"','"+descripcion+"','"+color+"','"+tamaño+"','"+codigo_categoria+"','"+dni_usua+"','"+codi_marca+"')";
         Statement st=con.createStatement();
         st.executeQuery(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
 public String ActualizarProducto(String codigo_barra,String nombre,String descripcion,String color,String tamaño,String codigo_categoria,String dni_usua,int codi_marca){
      String estado="INCORRECTO";
     try {
         String sql="CALL XX('"+codigo_barra+"','"+nombre+"','"+descripcion+"','"+color+"','"+tamaño+"','"+codigo_categoria+"','"+dni_usua+"','"+codi_marca+"')";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
 
 
 //::::::::::::::::::::::::::producto:::::::::::::::::::::::::::::::::
 
 //::::::::::::::::::::::::::Categoria::::::::::::::::::::::::::::::::
  public String InsertarCategoria(String codigo_Categoria,String nombre,String descripcion){
     String estado="INCORRECTO";
     try {
         String sql="CALL InsertarCategoria('"+codigo_Categoria+"','"+nombre+"','"+descripcion+"')";
         Statement st=con.createStatement();
         st.executeQuery(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
  
   public String ActualizarCategoria(String codigo_Categoria,String nombre,String descripcion){
      String estado="INCORRECTO";
     try {
         String sql="CALL XX('"+codigo_Categoria+"','"+nombre+"','"+descripcion+"')";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
   public ResultSet ConsultaCategoria(){
       ResultSet rs=null;
       try {
           String sql="CALL ConsultaCategoria()";
           Statement st=con.createStatement();
           rs=st.executeQuery(sql);
       } catch (Exception e) {
       }
       return rs;
           
   }
 //::::::::::::::::::::::::::Categoria::::::::::::::::::::::::::::::::
   
//:::::::::::::::::::::::::::Igv::::::::::::::::::::::::::::::::::::::
     public String InsertarIgv(String codigo_igv,int porcentaje,String descripcion,String año){
     String estado="INCORRECTO";
     try {
         String sql="CALL XX('"+codigo_igv+"','"+porcentaje+"','"+descripcion+"','"+año+"')";
         Statement st=con.createStatement();
         st.executeQuery(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
     
 public String ActualizarIGV(String codigo_igv,int porcentaje,String descripcion, String año){
      String estado="INCORRECTO";
     try {
         String sql="CALL XX('"+codigo_igv+"','"+porcentaje+"','"+descripcion+"','"+año+"')";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
//:::::::::::::::::::::::::::IGV::::::::::::::::::::::::::::::::::::::
 //::::::::::::::::::::::::::MARCA::::::::::::::::::::::::::::::::::::
 public ResultSet ConsultaMarca(){
     ResultSet rs=null;
     try {
         String sql="CALL ConsultaMarca()";
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
     } catch (Exception e) {
         
     }
     return rs;
 }
 public String InsertarMarca(String codigo,String nombre,String descripcion)
         
 {
     String estado="INCORRECTO";
     try {
         String sql="CALL InsertarMarca('"+codigo+"','"+nombre+"','"+descripcion+"')";
         Statement st=con.createStatement();
         st.executeQuery(sql);
         estado="CORRECTO";
     } catch (Exception e) {
         
     }
     return estado;
 }
         
 
 //::::::::::::::::::::::::::FIN MARCA::::::::::::::::::::::::::::::::
 public ResultSet RetornaMarca(String nombre){
     ResultSet rs=null;
     try {
         String sql="CALL RetornarIdMarca('"+nombre+"')";
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
     } catch (Exception e) {
     }
     return rs;
 }
 public ResultSet RetornaCategoria(String categoria){
     ResultSet rs=null;
     try {
         String sql="CALL RetornarIdCategoria('"+categoria+"')";
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
     } catch (Exception e) {
         
     }
     return rs;
 }
         
    
}
