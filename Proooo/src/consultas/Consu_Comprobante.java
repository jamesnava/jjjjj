
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

    
}
