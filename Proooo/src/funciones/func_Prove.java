
package funciones;

import consultas.Consu_Proveedor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class func_Prove {
    Consu_Proveedor obj_Consu_Proveedor;
    public func_Prove(){
        obj_Consu_Proveedor=new Consu_Proveedor();
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
