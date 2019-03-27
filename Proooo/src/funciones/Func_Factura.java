
package funciones;
import consultas.Consu_Comprobante;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Func_Factura extends Comprobante{
    public Func_Factura(){
        
    }
    
    public double AfectacionIgv(double importeTotal){
        Consu_Comprobante obj_Consu_Comprobante=new Consu_Comprobante();
        return (obj_Consu_Comprobante.optenerIgv("ACTIVO")/100)*importeTotal;
        
    }
    public String  RetornarSerieFactura(){
        return ladoIzquierdoSerieFatura()+setSerieComprobante("FACTURA");
       // return "";
    }
    private String ladoIzquierdoSerieFatura(){
        return "F0001 - ";
    }
    public double importeFactura(JTable tabla){
        SetImporteTotal(tabla);
        return getImporteTotal();
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
    public void pasaDatosEntreTabla(JTable tablaOrigen,JTable tablaDestino){
       
        DefaultTableModel modeloDestino=(DefaultTableModel)tablaDestino.getModel();
        int row=tablaOrigen.getRowCount();
        Object valores[]=new Object[7];
        for(int i=0;i<row;i++){
            valores[0]=i+1;
            valores[1]=tablaOrigen.getValueAt(i, 3);
            valores[2]=tablaOrigen.getValueAt(i,1);
            valores[3]=tablaOrigen.getValueAt(i,2);
            valores[4]="hola";
            valores[5]="GRAVADA";
            
            valores[6]=tablaOrigen.getValueAt(i,4);
           // System.out.println("valores"+getImporte());     
            modeloDestino.addRow(valores);
        }
        tablaDestino.setModel(modeloDestino);
        System.out.println("filas: "+row);
    }
    public boolean InsertarDatosAFactura(String dni,JLabel razonSocial,JLabel Labelruc, JLabel direccion){
        Consu_Comprobante obj_Consu_Comprobante=new Consu_Comprobante();
                        ResultSet rs=obj_Consu_Comprobante.consultaclienteDni(dni);
                        boolean valor=false;
                        try {
            while(rs.next()){
                String ruc=rs.getString("ruc_clie");
                if(ruc.length()>0){
                    String nombre=rs.getString("nomb_clie");
                    String apelP=rs.getString("apel_pate_clie");
                    String apelM=rs.getString("apel_mate_clie");
                    String dire=rs.getString("dire_clie");
                    razonSocial.setText(nombre+" "+apelP+" "+apelM);
                    Labelruc.setText(ruc);
                    direccion.setText(dire);
                    valor=true;
                }
                else{
                    JOptionPane.showMessageDialog(null,"El cliente no cuenta con Ruc");
                    valor=false;
                }
            }
        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null,"Registro no encontrada");
                            valor=false;
        }
                        return valor;
    }
   
     
   
}
