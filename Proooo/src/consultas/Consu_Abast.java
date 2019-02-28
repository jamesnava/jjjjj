
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
    // :::::::::::::::::Abastecimiento::::::::::::::::::::::::::::
    public String InsertarAbastecimiento(int idAbastecimiento,String fecha,float monto,String rucProveedor,String dniUsuario){
        String valor="";
        String sql="CALL InsertarAbastecimiento('"+idAbastecimiento+"','"+fecha+"','"+monto+"','"+rucProveedor+"','"+dniUsuario+"')";
        try {
            Statement st=con.createStatement();
            st.executeQuery(sql);
            valor="CORRECTO";
        } catch (SQLException e) {
            System.out.println(e);
            valor="INCORRECTO";
        }
        return valor;
    }
    
    // retornar maximo
    public int retornarIdMaximoAbastecimiento(){
        int valor=0;
        String sql="CALL retornarIdMaximoAbastecimiento()";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                valor=rs.getInt("codigo");
            }
        } catch (Exception e) {
        }
        return valor;
    }
    //::::::::::::::::::fin Abastecimiento::::::::::::::::::::::::
    //::::::::::::::::::inicio detalle abasteciemiento
    public String InsertarDetalleAbastecimiento(int cantidadProducto,String descripcion,float importe,int codigoDetalle,int codigoAbastecimiento,String codigoProducto){
        String valor="";
        String sql="CALL InsertarDetalleAbastecimiento('"+cantidadProducto+"','"+descripcion+"','"+importe+"','"+codigoDetalle+"','"+codigoAbastecimiento+"','"+codigoProducto+"')";
        try {
            Statement st=con.createStatement();
            st.executeQuery(sql);
            valor="CORRECTO";
        } catch (SQLException e) {
            valor="INCORRECTO";
        }
        return valor;
    }
    
    public int RetornarIdMaximoDetalleAbastecimiento(){
        int valor=0;
        String sql="CALL retornarIdMaximoDetalleAbastecimiento()";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                valor=rs.getInt("codigo");
            }
        } catch (Exception e) {
        }
        return valor;
    }
    //:::::::::::::::::fin detalle abastecimiento:::::::::::::::::::::::::::
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
           rs =st.executeQuery(sql);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rs;
        
    }
    //consulta cantidad producto por idProducto
    public int consultaCatidadPorProducto(String codigo){
        String sql="CALL RetornarCantidadProducto('"+codigo+"')";
       int n=0;
        try {
            Statement st=con.createStatement();
           ResultSet rs =st.executeQuery(sql);
           while(rs.next()){
               n=rs.getInt("cantidad");
           }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return n;
        
    }
    // consulta el id maximo del stock
    public int RetornarIdMaximoStock(){
        String sql="CALL RetornarIdMaximoStock()";
        int n=0;
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                n=rs.getInt("codigo");
            }
        } catch (Exception e) {
        }
        return n;
    }
    
    //
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
    public String InsertarStock(int codigo,int cantidad,int codigoAbastecimiento,String codigoSede,String codigoProducto){
        String valor="";
        String sql="CALL InsertarStockAlmacen('"+codigo+"','"+cantidad+"','"+codigoAbastecimiento+"','"+codigoSede+"','"+codigoProducto+"')";
        try {
            Statement st=con.createStatement();
            st.executeQuery(sql);
            valor="CORRECTO";
        } catch (SQLException e) {
            valor="INCORRECTO";
        }
        return valor;
    }
  public void ActualizarStock(int cantidad,String codigoSucursal,String codigoProducto){
      String sql="CALL ActualizarStock('"+cantidad+"','"+codigoSucursal+"','"+codigoProducto+"')";
      try {
          Statement st=con.createStatement();
          st.executeUpdate(sql);
      } catch (Exception e) {
      }
      
  }
  //consulta se ya se registro un producto...
 /* public boolean ConsultaInsertoAlmacen(String codigoSede,String codigoProducto){
      String 
  }*/
}
