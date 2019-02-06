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
public class Consu_Logue_usua {
    Connection con;
    conectar optener;
 public Consu_Logue_usua(){
     optener=new conectar();
     con=null;
 }
 public String estadoUsuario(String usuario, String contra){
     String estado="";
     try {
         con=optener.getConectar();
         String sql="CALL log_usuario('"+usuario+"','"+contra+"')";
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(sql);
         while(rs.next()){
             estado=rs.getString("estado");
             System.out.println("valor: "+estado);
             
         }
         
     } catch (Exception e) {
         estado="unknow";
     }
     return estado;
 }   
    
}
