
package consultas;

import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Consu_Duen {
    Connection con;
    conectar optener;
    public Consu_Duen(){
        con=null;
        optener=new conectar();
    }
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
