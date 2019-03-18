
package funciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    private String  RetornarSerieFactura(){
        return ladoIzquierdoSerieFatura()+setSerieComprobante("FACTURA");
       // return "";
    }
    private String ladoIzquierdoSerieFatura(){
        return "F0001 - ";
    }
    public double importeFactura(JTable tabla){
        SetImporte(tabla);
        return getImporte();
    }
    public void insertarLogo(JLabel labelLogo,String ruc){
        InsertarLogo(labelLogo, ruc);
    }
    public void InsertarFactura(JTable tabla){
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        String serieFactura=RetornarSerieFactura();
        int idFactura=retornarIdMaximoFactura();
        int idDetalle=retornarIdMaximoDetalleFactura();
        int row=modelo.getRowCount();
        //insertarFactura...
        
        for(int i=0;i<row;i++){
           //String codigoProducto=...
           //int cantidadProducto=...
          //RestarStock(codigoProducto,cantidadProducto, codigoSede);
          //obj_ConsuComprobante.InsertarDetalleFactura(idDetalle,cantidadProducto,descripcionDetalle,importe,idFactura,codigoProducto);  
           
        }
        //obj_ConsuComprobante.InsertarFacturaCabecera();
    }
    public int retornarIdMaximoDetalleFactura(){
        int valor=0;
        
        //obj_ConsuComprobante.IdmaximoDetalleFactura();
        valor=valor+1;
        return valor;
    }
    public int retornarIdMaximoFactura(){
        int valor=0;
        
        //obj_ConsuComprobante.IdmaximoDetalleFactura();
        
        valor=valor+1;
        return valor;
    }
    
    

  
    

   
    
   
}
