
package funciones;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Func_Boleta extends Comprobante{
    
public String RetornarSerieBoleta(){
    return ladoIzquierdoSerieBoleta()+setSerieComprobante("BOLETA");
}
private String ladoIzquierdoSerieBoleta(){
        return "B0001 - ";
    }
//IMPORTE
public double importeBoleta(JTable tabla){
        SetImporte(tabla);
        return getImporte();
    }
// insertar logo
public void insertarLogo(JLabel labelLogo,String ruc){
        InsertarLogo(labelLogo, ruc);
    }
//insertar boleta...
public void InsertarFactura(JTable tabla){
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        String serieFactura=RetornarSerieBoleta();
        int idFactura=retornarIdMaximoBoleta();
        int idDetalle=retornarIdMaximoDetalleBoleta();
        int row=modelo.getRowCount();
        
        
        for(int i=0;i<row;i++){
           //String codigoProducto=...
           //int cantidadProducto=...
          //RestarStock(codigoProducto,cantidadProducto, codigoSede);
          //obj_ConsuComprobante.InsertarDetalleBoleta(idDetalle,cantidadProducto,descripcionDetalle,importe,idFactura,codigoProducto);  
           
        }
        //obj_ConsuComprobante.InsertarBoletaCabecera();
    }




public int retornarIdMaximoDetalleBoleta(){
        int valor=0;
        
        //obj_ConsuComprobante.IdmaximoDetalleFactura();
        valor=valor+1;
        return valor;
    }
    public int retornarIdMaximoBoleta(){
        int valor=0;
        
        //obj_ConsuComprobante.IdmaximoDetalleFactura();
        
        valor=valor+1;
        return valor;
    }
        
}
