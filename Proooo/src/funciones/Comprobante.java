
package funciones;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;


public class Comprobante {
    private double importe;
    private String CantidadComprobante;
    public Comprobante(){
        importe=0;
        CantidadComprobante="";
    }
    
    public void SetImporte(JTable tabla){
        String valor;
        int row=tabla.getRowCount();
        for(int i=0;i<=row;i++){
            valor=tabla.getValueAt(i,0).toString();
            try {
                importe=importe+Double.parseDouble(valor);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
     
    }
    public double getImporte(){
        return importe;
    }
    public String setCantidadComprobantes(String condicion){
        
        switch(condicion){
            case "FACTURA":
                ResultSet rs1=null;
                    try {
                        while(rs1.next()){
                            String valor=rs1.getString("seri_fact");
                        }
                } catch (SQLException e) {
                        System.out.println(e);
                }
                break;
            case "BOLETA":
                ResultSet rs2=null;
                    try {
                        while(rs2.next()){
                            
                        }
                    
                } catch (SQLException e) {
                        System.out.println(e);
                }
                break;
            case "PEDIDO":
                ResultSet rs3=null;
                        
                    try {
                        while(rs3.next()){
                            
                        }
                    
                } catch (SQLException e) {
                        System.out.println(e);
                }
                break;
        }
        return "";
        
    }
    public int UltimoNumero(String serie){
        String parteD=serie.substring(7,13);
        String cantidad="";
        int n=0;
        for(int i=0;i<=parteD.length();i++){
            if(parteD.substring(i, i+1)!="0"){
                n=i;
                cantidad=parteD.substring(n,parteD.length());
                break;
            }
        }
        return Integer.parseInt(cantidad);
    } 
    
    
}
