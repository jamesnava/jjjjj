/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import java.sql.Connection;
import funciones.conectar;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NAVARRO
 */
public class Consu_tien {
    Connection con;
    conectar optener;
public Consu_tien(){
    con=optener.getConectar();
}
public String InsertarSucursal(String codigo,String nombre,String direccion,String telefono,String correo,String ruc){
    String variableRetorno="INCORRECTO";
    String sql="CALL RegistrarSucursal('"+codigo+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"','"+ruc+"')";
    try {
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
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            ruc=rs.getString("ruc_tien");
        }
    } catch (Exception e) {
        
    }
    return ruc;
}
    
}
