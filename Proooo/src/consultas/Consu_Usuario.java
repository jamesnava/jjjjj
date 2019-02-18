
package consultas;

import com.mysql.jdbc.Connection;
import funciones.Contrasenia;
import funciones.conectar;
import java.sql.SQLException;
import java.sql.Statement;


public class Consu_Usuario {
    Connection con;
    conectar optener;
    public Consu_Usuario(){
        con=null;
        optener=new conectar();
        
    }
  public String InsertarUsuario(String dni,String nombre,String apellidoP,String direccion,String telefono,String correo,String usuario,String contrasenia,String sucursal,String ApellidoM,String estado,String cargo){
      String valor="INCORRECTO";
      Consu_tien obj_Consu_tien=new Consu_tien();
      Consu_Duen obj_Consu_Due=new Consu_Duen();
      
      String codigoCargo=obj_Consu_Due.RetornarCodigoCargo(cargo);
      String codigoSucursal=obj_Consu_tien.RetornarCodigoSede(sucursal);
      // comprobar contrasenia...
      System.err.println("dni: "+dni+" nombre "+nombre+" apellidoP "+apellidoP+" direccion "+direccion+" telefono "+telefono+" correo "+correo+" usuario "+usuario+" contrasenia "+ contrasenia+" sucursal "+
              codigoSucursal+" cargo "+codigoCargo);
      
    
      
      
      System.out.println("codig sede "+codigoSucursal+" ff"+codigoCargo);
      
      try {
          String sql="CALL InsertarUsuario('"+dni+"','"+nombre+"','"+apellidoP+"','"+direccion+"','"+telefono+"','"+correo+"','"+usuario+"','"+contrasenia+"','"+codigoSucursal+"','"+ApellidoM+"','"+codigoCargo+"')";
          Statement st=con.createStatement();
          st.executeQuery(sql);
          valor="CORRECTO";
      } catch (SQLException e) {
          System.out.println("error: "+e);
      }
      return valor;
  
  
  
      
  } 
}
