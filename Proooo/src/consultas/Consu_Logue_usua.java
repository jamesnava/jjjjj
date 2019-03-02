
package consultas;

import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Consu_Logue_usua {
    Connection con;
    conectar optener;
 public Consu_Logue_usua(){
     optener=new conectar();
     con=null;
 }
 public String estadoUsuario(String usuario, String contra, String car,String codigoSede){
     String id_car=optenerNivel(car);
    
     String estado="";
     try {
         con=optener.getConectar();
         String sql="CALL log_usuario('"+usuario+"','"+contra+"','"+codigoSede+"')";
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(sql);
         while(rs.next()){
            if(rs.getString("cargoo").equals(id_car)){
            estado=rs.getString("estado");
            }
            // System.out.println("cargo "+rs.getString("estadoo")+" nombre"+rs.getString("estado"));
             
         }
         
         
     } catch (Exception e) {
         estado="unknow";
     }
     return estado;
     
 }
 // consultar cargo...
 public ResultSet consultaCargo(){
     
     ResultSet rs=null;
            try {
                con=optener.getConectar();
                String sql="CALL nivelAcceso()";
                Statement st=con.createStatement();
                rs=st.executeQuery(sql);
                
            } catch (Exception e) {
                
            }
            return rs;
 }
 //OBTENER EL ID DEL CARGO
 public String optenerNivel(String valor){
     String nivel="";
     con=optener.getConectar();
     try {
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("CALL OptenerNivel('"+valor+"')");
         while(rs.next()){
             nivel=rs.getString("codigo");
            
         }
         
     } catch (Exception e) {
     }
     return nivel;
 }
 //recuperar dni del usuario...
 public String RecuperarDni(String usuario,String contra){
     String dni="";
     con=optener.getConectar();
     try {
         String Sql="CALL RecuperarDniUsuario('"+usuario+"','"+contra+"')";
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(Sql);
         while(rs.next()){
             dni=rs.getString("dni");
         }
     } catch (Exception e) {
     }
     
     return dni;
 }
 
 //comprobar Sede...
}
