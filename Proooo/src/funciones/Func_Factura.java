
package funciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;

public class Func_Factura extends Comprobante{
    public Func_Factura(){
        
    }
    public double GetIgv(ResultSet resultado){
        double igv=0.0;
        try {
            ResultSet rs=resultado;
            while(rs.next()){
                igv=rs.getDouble("");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return igv;
    
    } 
    
    
    

  
    

   
    
   
}
