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
import javax.swing.JOptionPane;

/**
 *
 * @author NAVARRO
 */
public class Consu_Duen {
    Connection con;
    conectar optener;
    public Consu_Duen(){
        con=null;
        optener=new conectar();
    }
  public void InsertarDueno(String dni,String nombre,String apellidoP,String apellidoM,String correo,String usuario,String contra){
      con=optener.getConectar();
      String sql="CALL insertarDueno('"+dni+"','"+nombre+"','"+apellidoP+"','"+apellidoM+"','"+correo+"','"+usuario+"','"+contra+"')";
      try {
          Statement st=con.createStatement();
          st.executeQuery(sql);
          JOptionPane.showMessageDialog(null,"Se Registró Correctamente");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Ocurrió Problemas de Registro");
      }
  }
  public int ConsultaDueno(){
       con=optener.getConectar();
       int cantidadDueno=0;
       String sql="CALL ConsultaDueno()";
       try {
          Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
          cantidadDueno=rs.getInt("cantidad");
                  }
      } catch (Exception e) {
      }
       return cantidadDueno;
    }
  
  //:::::::::::::::::::::::::::::::::::::::::::::::REGISTRO TIENDA:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  public void insertarTienda(String ruc,String nombreT, String sitioweb){
      con=optener.getConectar();
      String sql="CALL RegistroTienda('"+ruc+"','"+nombreT+"','"+sitioweb+"')";
      try {
          Statement st=con.createStatement();
          st.executeQuery(sql);
      } catch (Exception e) {
          
      }
  }
  
  //::::::::::::::::::::::::::::::::::::::::::::::::REGISTRO TIENDA::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
  
    
}
