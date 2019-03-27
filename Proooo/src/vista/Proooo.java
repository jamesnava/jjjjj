
package vista;

import consultas.Consu_Comprobante;
import funciones.*;
import javax.swing.JOptionPane;


public class Proooo {

    public static void main(String[] args) {
        
      // Comprobante obj=new Comprobante();
                 //  System.out.println("codigo: "+obj.UltimoNumero("F001 - 000901"));
       //int valor=JOptionPane.showConfirmDialog(null,"aceptas?");
        //System.out.println("valor: "+valor);
        //Consu_Comprobante obj=new Consu_Comprobante();
        //float optener=obj.RetornarCantidadProducto("RR-TT","TT-TTT");
      // System.out.println(optener);
        //Consu_Comprobante obj=new Consu_Comprobante();
        //obj.insertarDetalleBoleta(3,50,"ffdfdf", 20,"01", "RR-TT", 23);
        //obj.retornoSerieConMaxIdFactura();
        
       // System.out.println(obj.retornoSerieConMaxIdFactura());
        Func_Factura obj=new Func_Factura();
        System.out.println("serie es: "+obj.AfectacionIgv(100));
    

               
        
    }
    
}
