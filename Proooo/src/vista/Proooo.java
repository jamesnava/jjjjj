
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
        //float optener=obj.optenerIgv("ACTIVO");
       // System.out.println(optener);
        Consu_Comprobante obj=new Consu_Comprobante();
        obj.insertarboleta("01", "2019-03-18", 30, 20, "fota", "47259761","47584657","FFF",3);
        
        System.out.println(obj);
        
    

               
        
    }
    
}
