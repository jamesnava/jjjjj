
package consultas;

import java.sql.Connection;
import funciones.Contrasenia;
import funciones.conectar;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consu_Usuario {
    Connection con;
    conectar optener;
    public Consu_Usuario(){
        con=null;
        optener=new conectar();
        
        
    }
  public String InsertarUsuario(String dni,String nombre,String apellidoP,String direccion,String telefono,String correo,String usuario,String contrasenia,String sucursal,String ApellidoM,String estado,String cargo,File file){
    con=optener.getConectar();
    FileInputStream pif=null;
      String valor="INCORRECTO";
      Consu_tien obj_Consu_tien=new Consu_tien();
      Consu_Duen obj_Consu_Due=new Consu_Duen();
      
      int codigoCargo=obj_Consu_Due.RetornarCodigoCargo(cargo);
      String codigoSucursal=obj_Consu_tien.RetornarCodigoSede(sucursal);
      // leer la imagen
      try {
         pif =new FileInputStream(file);
      } catch (Exception e) {
      }
            
      
     // System.out.println("codig sede "+codigoSucursal+" ff"+codigoCargo);
      
      try {
          
        //  String sql="CALL InsertarUsuario('"+dni+"','"+nombre+"','"+apellidoP+"','"+direccion+"','"+telefono+"','"+correo+"','"+usuario+"','"+contrasenia+"','"+codigoSucursal+"','"+ApellidoM+"','"+estado+"','"+codigoCargo+"')";
         String sql="CALL InsertarUsuario(?,?,?,?,?,?,?,?,?,?,?,?,?)";
          /*Statement st=con.createStatement();
          st.executeQuery(sql);*/
          PreparedStatement ps=con.prepareStatement(sql);
          ps.setString(1,dni);
          ps.setString(2,nombre);
          ps.setString(3,apellidoP);
          ps.setString(4,direccion);
          ps.setString(5,telefono);
          ps.setString(6,correo);
          ps.setString(7,usuario);
          ps.setString(8,contrasenia);
          ps.setString(9,codigoSucursal);
          ps.setString(10,ApellidoM);
          ps.setString(11,estado);
          ps.setInt(12,codigoCargo);
          ps.setBinaryStream(13,pif,(int)file.length());
          ps.executeUpdate();
         
          
          valor="CORRECTO";
      } catch (SQLException e) {
          System.out.println("error: "+e);
      }
      return valor;
  
  
  
      
  } 
  public Blob RetornarByteImagen(String dni){
      con=optener.getConectar();
      Blob blob=null;
      String sql="CALL RetornarImagen('"+dni+"')";
      try {
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              blob=rs.getBlob("image");
          }
      } catch (Exception e) {
      }
      return blob;
  }
}
