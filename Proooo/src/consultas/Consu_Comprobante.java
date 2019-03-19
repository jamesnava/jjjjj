
package consultas;


import funciones.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Consu_Comprobante {
    conectar conecta;
    Connection optener=null;
    
    public Consu_Comprobante(){
        conecta=new conectar();
        optener=conecta.getConectar();
        
      
    }
    public float optenerIgv(String estado){
        String sql="CALL OptenerIgv('"+estado+"')";
        float porcentaje=0;
        
        try {
            Statement st=optener.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                porcentaje=rs.getFloat("valorActual");     
                
                
                
            }
            
            
        }
        catch (Exception e) {
        }
        return porcentaje;
    }
    public void insertarboleta(String codigo,String fecha,float total,float subtotal,String observacion,String dnicliente,String dniusuario,String serie,float descuento){
    String sql="CALL InsertarBoleta('"+codigo+"','"+fecha+"','"+total+"','"+subtotal+"','"+observacion+"','"+dnicliente+"','"+dniusuario+"','"+serie+"','"+descuento+"')";
        try {
            Statement st=optener.createStatement();
            st.executeQuery(sql);
            
        } catch (Exception e) {
        }
    }
    public void insertarDetalleBoleta(int codigodetalle,int cantidad,String descripcion,float importe,String numeboleta,String codiproducto,float preciounidad){
    String sql="CALL InsertarDetalleBoleta('"+codigodetalle+"','"+cantidad+"','"+descripcion+"','"+importe+"','"+numeboleta+"','"+codiproducto+"','"+preciounidad+"')";
        try {
            Statement st=optener.createStatement();
            st.executeQuery(sql);
            
        } catch (Exception e) {
        }
    } 
public int RetornarCantidadProducto(String codigo,String sede){
    String sql="CALL RetornarCantidadProducto('"+codigo+"','"+sede+"')";
    int cantidadOptener=0;
        try {
            Statement st=optener.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()) { 
                cantidadOptener=rs.getInt("cantidad");
                
            }
        
    } catch (Exception e) {
    }
        return cantidadOptener;
}
   public void insertarFactura(int codigo,String fecha,float total,float subtotal,String dniusuario,String dnicliente,String observacion,String serie,float descuento,String codigoIgv){
    String sql="CALL InsertarFactura('"+codigo+"','"+fecha+"','"+total+"','"+subtotal+"','"+dniusuario+"','"+dnicliente+"','"+observacion+"','"+serie+"','"+descuento+"','"+codigoIgv+"')";
        try {
            Statement st=optener.createStatement();
            st.executeQuery(sql);
            
        } catch (Exception e) {
        }
    } 
   public void insertarDetalleFactura(int codigodetalle,int cantidad,String descripcion,float importe,int numefactura,String codiproducto,float preciounidad){
    String sql="CALL InsertarDetalleFactura('"+codigodetalle+"','"+cantidad+"','"+descripcion+"','"+importe+"','"+numefactura+"','"+codiproducto+"','"+preciounidad+"')";
        try {
            Statement st=optener.createStatement();
            st.executeQuery(sql);
            
        } catch (Exception e) {
        }
       
    }
   public int retornoMaxIdFactura(){
            String sql="CALL RetornarMaximoIdFactura()";
            int idmaximo=0;
            try {
                Statement st=optener.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()) { 
                   idmaximo=rs.getInt("codigo");
                    
                }
                
            } catch (Exception e) {
            }
            return idmaximo;
        }
    public int retornoMaxIdDetalleFactura(){
            String sql="CALL RetornarMaximoIdDetalleFact()";
            int maximo=0;
            try {
                Statement st=optener.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()) { 
                    maximo=rs.getInt("codigo");
                    
                }
                
            } catch (Exception e) {
            }
            return maximo;
        }
   
}
