
package funciones;

import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {
   private String bd;
   private String usuario;
   private String contra;
   private String url="";
   private Connection conecta;
    public conectar(){
       bd="sistemagenerico";
     usuario="root";
     contra="";
     url="jdbc:mysql://localhost/"+bd;
     conecta=null;
     //ejecutamos...
     ejecutarConectar();
 }
 private void ejecutarConectar(){
    
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
 public void CerrarConnection()
 {
     try {
         conecta.close();
     } catch (SQLException e) {
         System.out.println("no Existe la conexcion");
     }
     
 } 
    
            
}
