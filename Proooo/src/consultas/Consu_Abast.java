
package consultas;

import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Consu_Abast {
    Connection con;
    conectar optener;
    public Consu_Abast(){
        optener=new conectar();
        con=optener.getConectar();
    }
    public ResultSet RetornarPrecios(String codigo){
        String sql="CALL RetornarPrecioProducto('"+codigo+"')";
        ResultSet rs=null;
        try {
           Statement st=con.createStatement();
           rs=st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
       
        return rs;
    }
    //::::::::::::::::::::::consulta almacen stock:::::::::::::::::::::::
    public ResultSet consultaStockPorAlmacen(){
        String sql="CALL ConsultaStockPorAlmacen()";
        ResultSet rs=null;
        try {
            Statement st=con.createStatement();
            rs=st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
        
    }
    public ResultSet ConsultaAlmacen(){
        ResultSet rs=null;
        String sql="CALL ConsultaAlmacen()";
        try {
            Statement st=con.createStatement();
            rs=st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
    }
    
}
