
package consultas;

import java.sql.Connection;
import funciones.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consu_Proveedor {
    Connection con;
    conectar optener;
public Consu_Proveedor()
{
    con=null;
    optener=new conectar();
    con=optener.getConectar();
}
 public String InsertarProveedor(String ruc,String razon,String direccion,String telefono,String correo){
        String sql="CALL InsertarProveedor('"+ruc+"','"+razon+"','"+direccion+"','"+telefono+"','"+correo+"')";
        String valor="";
        try {
            Statement st=con.createStatement();
            st.executeQuery(sql);
            valor="CORRECTO";
        } catch (Exception e) {
            valor="INCORRECTO";
        }
        return valor;
        
    }
 public ResultSet ConsultaProveedor(){
     ResultSet rs=null;
     String sql="CALL ConsultaProveedor()";
     try {
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
     } catch (Exception e) {
         
     }
     return rs;
 }
 public ResultSet ConsultaProveedorDni(String dni){
     ResultSet rs=null;
     String sql="CALL consultaProveedorPorDni('"+dni+"')";
     try {
         Statement st=con.createStatement();
         
         rs=st.executeQuery(sql);
     } catch (SQLException e) {
         System.out.println(e);
     }
     return rs;
 }
 
    
}
