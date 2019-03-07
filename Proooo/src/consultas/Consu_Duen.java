
package consultas;

import funciones.conectar;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Consu_Duen {
    Connection con;
    conectar optener;
    public Consu_Duen(){
        con=null;
        optener=new conectar();
    }
  //cerrar la coneecxion
   
  public void InsertarDueno(String dni,String nombre,String apellidoP,String apellidoM,String correo,String usuario,String contra,String telefono){
      con=optener.getConectar();
      String sql="CALL insertarDueno('"+dni+"','"+nombre+"','"+apellidoP+"','"+apellidoM+"','"+correo+"','"+usuario+"','"+contra+"','"+telefono+"')";
      try {
          Statement st=con.createStatement();
          st.executeQuery(sql);
          JOptionPane.showMessageDialog(null,"Se Registró Correctamente");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Ocurrió Problemas de Registro");
      }
      //cerrar...
      
     
      
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
  public void insertarTienda(String ruc,String nombreT, String sitioweb,File file){
      con=optener.getConectar();
      FileInputStream fi;
      
     // String sql="CALL RegistroTienda('"+ruc+"','"+nombreT+"','"+sitioweb+"')";
      String sql="CALL RegistroTienda(?,?,?,?)";
      try {
          fi=new FileInputStream(file);
          PreparedStatement ps=con.prepareStatement(sql);
          ps.setString(1,ruc);
          ps.setString(2,nombreT);
          ps.setString(3,sitioweb);
          ps.setBinaryStream(4, fi,(int)file.length());
          ps.executeUpdate();
      } 
      catch(IOException e){
          System.out.println(e);
      }
      catch (SQLException e) {
          System.out.println(e);
      }
      
      
  }
  
  //::::::::::::::::::::::::::::::::::::::::::::::::REGISTRO TIENDA::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//cargo..............
  public ResultSet RetornarNombreCargo(){
      ResultSet rs=null;
      String sql="CALL ConsultaCargo()";
      con=optener.getConectar();
      try {
          Statement st=con.createStatement();
          rs=st.executeQuery(sql);
      } catch (Exception e) {
          
      }
      
      
      return rs;
      
  }
  // retornar codigo cargo...
  public int RetornarCodigoCargo(String nombre){
    con=optener.getConectar();
    int idCargo=0;
    String sql="CALL RetornarIdCargo('"+nombre+"')";
    try {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            idCargo=rs.getInt("codigoCargo");
        }
    } catch (Exception e) {
    }
    return idCargo;
}

  
 //fin cargo.............
    
}
