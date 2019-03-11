
package consultas;

import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consu_Ventas {
    Connection con=null;
    conectar optener;
 public Consu_Ventas(){
     optener=new conectar();
     con=optener.getConectar();
 }
 public ResultSet ConsultaProductoLike(String nombre){
     ResultSet rs=null;
     try {
         String sql="SELECT * FROM producto WHERE nomb_prod LIKE '%"+nombre+"%'";
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
         
     } catch (SQLException e) {
         System.out.println(e);
     }
     return rs;
 }
 public ResultSet ComprobarStockProducto(String codigoProducto,String codigoSede){
     ResultSet rs=null;
     String sql="CALL RetornarProductoAlmacenMayoresCero('"+codigoProducto+"','"+codigoSede+"')";
     try {
         Statement st=con.createStatement();
         rs=st.executeQuery(sql);
     } catch (SQLException e) {
         System.out.println(e);
     }
     return rs;
 }

 public int PrecioProducto(String codigoProducto){
     int n=0;
     String sql="CALL RetornarPrecioProducto('"+codigoProducto+"')";
     try {
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(sql);
         while(rs.next()){
             n=rs.getInt("prec_vent");
         }
     } catch (SQLException e) {
         System.out.println(e);
     }
     return n;
 }
 
}
