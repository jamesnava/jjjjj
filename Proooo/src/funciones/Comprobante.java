
package funciones;

import consultas.Consu_tien;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import funciones.func_imagen;
import java.awt.Image;
import java.sql.Blob;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

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
    public String setSerieComprobante(String condicion){
        String Serie="";
        System.err.println(condicion);
        switch(condicion){
            case "FACTURA":
                ResultSet rs1=null;
                    try {
                        while(rs1.next()){
                            String valor1=rs1.getString("seri_fact");
                            String Valor=RetornaSerieDerecha(UltimoNumero(valor1)+1);
                            Serie=Valor;
                            
                        }
                } catch (SQLException e) {
                        System.out.println(e);
                }
                break;
            case "BOLETA":
                ResultSet rs2=null;
                    try {
                        while(rs2.next()){
                            String valor1=rs2.getString("seri_bole");
                            String Valor=RetornaSerieDerecha(UltimoNumero(valor1)+1);
                            Serie=Valor;
                            System.err.println("aqui: "+Serie);
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
        return Serie;
        
    }
    private int UltimoNumero(String serie){
        String parteD=serie.substring(7,13);
        System.err.println("parte d: "+parteD);
        String cantidad="";
        int n=0;
        for(int i=0;i<=parteD.length();i++){
            if(parteD.substring(i,i+1)!="0"){
                n=i;
                cantidad=parteD.substring(n,parteD.length());
                break;
            }
        }
        return Integer.parseInt(cantidad);
    }
    public String RetornaSerieDerecha(int numero){
        String valor=String.valueOf(numero);
        String ResultadoFinal="";
        int tamaño=valor.length();
        for(int i=0;i<6-tamaño;i++){
            ResultadoFinal=ResultadoFinal+"0";
        }
        return ResultadoFinal+numero;
    }
    public int optenerStockAlmacen(String codigoProducto,String codigoSede){
        ResultSet rs=null;
        int valor=-1;
        try {
            while(rs.next()){
                valor=rs.getInt("cantidad");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Abastecerse!!");
        }
        return valor;
    }
    public int RestarStock(String codigoProducto,int cantidad,String codigoSede){
        int valor=optenerStockAlmacen(codigoProducto,codigoSede);
        int valorActualizado=valor-cantidad;
        if(valorActualizado<0){
            JOptionPane.showMessageDialog(null,"Stock Insuficiente!!");
            valorActualizado=-1;
        }
       return valorActualizado; 
    }
    public void InsertarLogo(JLabel label,String ruc){
        func_imagen obj_image=new func_imagen();
        Consu_tien obj_Consu_tien=new Consu_tien();
        Blob blob=null;
        ResultSet rs=obj_Consu_tien.RetornarLogoTienda(ruc);
        try {
            while(rs.next()){
                blob=rs.getBlob("logo");
            }
           
        } catch (SQLException e) {
            System.out.println(e);
        }
         Image img=obj_image.RetornarImagen(blob);
         ImageIcon icon=new ImageIcon(img.getScaledInstance(250,140,Image.SCALE_SMOOTH));
         label.setIcon(icon);
    }
    
    
    
}
