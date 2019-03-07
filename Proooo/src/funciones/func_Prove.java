
package funciones;

import consultas.Consu_Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class func_Prove {
    Consu_Proveedor obj_Consu_Proveedor;
    float totalPagar;
    public func_Prove(){
        obj_Consu_Proveedor=new Consu_Proveedor();
         
    }
    public void ressetTotalPagar(){
        totalPagar=0;
    }
    public void InsertarProveedor(String ruc,String razon,String direccion,String telefono,String correo){
        String valor=obj_Consu_Proveedor.InsertarProveedor(ruc, razon, direccion, telefono, correo);
        if(valor.equals("CORRECTO")){
            JOptionPane.showMessageDialog(null,"Se Insertó Correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null,"Problemas al Insertar");
        }
    }
    public void LlenarTablaProveedor(DefaultTableModel modelo){
        ResultSet rs=obj_Consu_Proveedor.ConsultaProveedor();
        modelo.setRowCount(0);
        String valor[]=new String[5];
        try {
            while(rs.next()){
                valor[0]=rs.getString("ruc_prov");
                valor[1]=rs.getString("razo_soci");
                valor[2]=rs.getString("dire_prov");
                valor[3]=rs.getString("tele_prov");
                valor[4]=rs.getString("corr_prov");
                modelo.addRow(valor);
            }
            
        } catch (Exception e) {
        }
        
    }
    //consulta de proveerdor por Ruc...
    public boolean ComprobarProveedor(String ruc){
        ResultSet rs=obj_Consu_Proveedor.ConsultaProveedorPorRuc(ruc);
        boolean valor=false;
        try {
            if(rs.next()){
                valor=true;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return valor;
    }
    // consulta datos del proveedor..
    public void DatosProveedorGuia(JLabel proveedorLabel,JLabel rucLabel,JLabel direccionLabel,String ruc){
        ResultSet rs=obj_Consu_Proveedor.ConsultaProveedorPorRuc(ruc);
        try {
            while(rs.next()){
                proveedorLabel.setText(rs.getString("razo_soci"));
                rucLabel.setText(rs.getString("ruc_prov"));
                direccionLabel.setText(rs.getString("dire_prov"));
            }
        } catch (Exception e) {
        }
    }
    
    //fin
    //pasar los valores de la tabla enviar a la guia para imprimir
    public void pasarDatosEntreTabla(JTable tablaEnviar,DefaultTableModel tablaGuia,JLabel labeltotal){
        int filas,columnas;
        
        float importe=0;
        tablaGuia.removeRow(0);
        filas=tablaEnviar.getRowCount();
        columnas=tablaEnviar.getColumnCount();
        for(int i=0;i<filas;i++){
            Object[] valores=new Object[6];
                 importe =Float.parseFloat(tablaEnviar.getValueAt(i,4).toString());
                valores[0]=i+1;
                valores[1]=tablaEnviar.getValueAt(i,1);
                valores[2]=tablaEnviar.getValueAt(i, 2);
                valores[3]=tablaEnviar.getValueAt(i,3);
                valores[4]=importe;
                valores[5]=tablaEnviar.getValueAt(i, 0);
                totalPagar=totalPagar+importe;
                
                
         tablaGuia.addRow(valores);
        }
        labeltotal.setText(String.valueOf(totalPagar));
    }
    //fin
    // pasar los valores de la tabla a los campos de texto..
    public void PasarValoresalCampo(JTextField ruc,JTextField razon,JTextField direccion,JTextField telefono,JTextField correo,JTable tabla){
        int row=tabla.getSelectedRow();
        ruc.setText(tabla.getValueAt(row,0).toString());
        razon.setText(tabla.getValueAt(row, 1).toString());
        direccion.setText(tabla.getValueAt(row,2).toString());
        telefono.setText(tabla.getValueAt(row, 3).toString());
        correo.setText(tabla.getValueAt(row, 4).toString());
        
    }
            
    
}
