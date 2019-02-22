
package consultas;

import java.sql.Connection;
import funciones.conectar;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Consu_tien {
    Connection con;
    conectar optener;
public Consu_tien(){
    optener=new conectar();
    con=null;
}
public String InsertarSucursal(String codigo,String nombre,String direccion,String telefono,String correo,String ruc){
    String variableRetorno="INCORRECTO";
    String sql="CALL RegistrarSucursal('"+codigo+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"','"+ruc+"')";
    try {
        con=optener.getConectar();
        Statement st=con.createStatement();
        st.executeQuery(sql);
        variableRetorno="CORRECTO";
    } catch (Exception e) {
    }
    return variableRetorno;
            
}
public String RetornnarRuc(){
    String ruc="";
    String sql="CALL RetornarRuc()";
    try {
        con=optener.getConectar();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            ruc=rs.getString("ruc");
        }
    } catch (Exception e) {
        
    }
    return ruc;
}
public ResultSet RetornarNombreT(){
    
   ResultSet nombre=null;
    
    String sql="CALL RetornarNombreTienda()";
    try {
        
        con=optener.getConectar();
        Statement st=con.createStatement();
        nombre=st.executeQuery(sql);
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
    }
    return nombre;
}
// Retorna el nombre del sucursal...
public ResultSet RetornarNombreSede()
{
    con=optener.getConectar();
    ResultSet rs=null;
    String sql="CALL ConsultaSede()";
    try {
        Statement st=con.createStatement();
        rs=st.executeQuery(sql);
    } catch (Exception e) {
        
    }
    return rs;
}
// Retornar codigo sucursal...
public String RetornarCodigoSede(String nombre){
    con=optener.getConectar();
    String idSede="";
    String sql="CALL RetornarIdSede('"+nombre+"')";
    try {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            idSede=rs.getString("codigoSede");
        }
    } catch (Exception e) {
    }
    return idSede;
}


    
}
