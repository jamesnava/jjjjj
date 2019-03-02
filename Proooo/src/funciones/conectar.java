/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NAVARRO
 */
public class conectar {
    String bd;
    String usuario;
    String contra;
    String url="";
    Connection conecta;
    public conectar(){
       bd="sistemagenerico";
     usuario="root";
     contra="";
     url="jdbc:mysql://localhost/"+bd;
     conecta=null;
     //ejecutamos...
     ejecutarConectar();
 }
 public void ejecutarConectar(){
    
     try {
          //obtenemos el Driver
         Class.forName("com.mysql.jdbc.Driver");
         //asignamos conneccion...
         conecta=DriverManager.getConnection(url,usuario,contra);
         
         
     } catch (Exception e) {
         System.out.println("no se establecio la conexion");
         System.out.println(e);
     }
     
     
 }
 public Connection getConectar(){
     return conecta;
 }
    
            
}
