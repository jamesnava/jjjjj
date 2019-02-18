
package funciones;
import consultas.Consu_ProdCate;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class func_ProdCate {
    Consu_ProdCate obj_Consu_ProdCate;
public func_ProdCate(){
    obj_Consu_ProdCate=new Consu_ProdCate();
}
public void insertarProducto(String codigo,String nombre,String descripcion,String color,String tamaño,String nomb_cate, String dni_usuario, String marca){
    ResultSet rsCategoria,rsMarca;
    int idMarca=0;
    String codigo_categoria="";
    rsCategoria=obj_Consu_ProdCate.RetornaCategoria(nomb_cate);
    rsMarca=obj_Consu_ProdCate.RetornaMarca(marca);
    try {
        while (rsMarca.next()) { 
            idMarca=rsMarca.getInt("codigoMarca");
            
        }
        while(rsCategoria.next()){
            codigo_categoria=rsCategoria.getString("codigoCategoria");
        }
    } catch (Exception e) {
    }
   String valor= obj_Consu_ProdCate.InsertarProducto(codigo, nombre, descripcion, color, tamaño, codigo_categoria, dni_usuario, idMarca);
   if(valor.equals("CORRECTO")){
       JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
   }
   else{
       JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
   }
}
public void ActualizarProducto(String codigo,String nombre,String descripcion,String color,String tamaño,String nomb_cate, String dni_usuario, String marca){
    ResultSet rsCategoria,rsMarca;
    int idMarca=0;
    String codigo_categoria="";
    rsCategoria=obj_Consu_ProdCate.RetornaCategoria(nomb_cate);
    rsMarca=obj_Consu_ProdCate.RetornaMarca(marca);
    try {
        while (rsMarca.next()) { 
            idMarca=rsMarca.getInt("idMarca");
            
        }
        while(rsCategoria.next()){
            codigo_categoria=rsCategoria.getString("codigoCategoria");
        }
    } catch (Exception e) {
    }
   String valor= obj_Consu_ProdCate.ActualizarProducto(codigo, nombre, descripcion, color, tamaño, codigo_categoria, dni_usuario, idMarca);
   if(valor.equals("CORRECTO")){
       JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
   }
   else{
       JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ALTUALIZAR");
   }
}

public void LlenarTablaProducto(DefaultTableModel modelo){
    Object valores[]=new Object[5];
    ResultSet rs=obj_Consu_ProdCate.ConsultaProducto();
    modelo.setRowCount(0);
    try {
        while(rs.next()){
            valores[0]=rs.getString("codi_barr_prod");
            valores[1]=rs.getString("nomb_prod");
            valores[2]=rs.getString("desc_prod");
            valores[3]=rs.getString("colo_prod");
            valores[4]=rs.getString("tama_prod");
            modelo.addRow(valores);

        }
    } catch (Exception e) {
        
    }
    
    
}

public void LlenarBusquedaTabla(DefaultTableModel modelo,String nombre){
    Object valores[]=new Object[5];
    ResultSet rs=obj_Consu_ProdCate.ConsultaProductoLike(nombre);
    modelo.setRowCount(0);
    try {
        while(rs.next()){
            valores[0]=rs.getString("codi_barr_prod");
            valores[1]=rs.getString("nomb_prod");
            valores[2]=rs.getString("desc_prod");
            valores[3]=rs.getString("colo_prod");
            valores[4]=rs.getString("tama_prod");
            modelo.addRow(valores);

        }
    } catch (Exception e) {
        
    }
}

//LLENAR LOS CAMPOS PARA ACTUALIZAR...
public void LlenarLosCamposParaActualizar(JTable tabla, JTextField codigo,JTextField nombre,JTextField color,JTextField tamanio,JTextArea textArea){
    int Row=tabla.getSelectedRow();
    int columna=tabla.getSelectedColumn();
    
        codigo.setText(String.valueOf(tabla.getValueAt(Row,0)));
        nombre.setText(String.valueOf(tabla.getValueAt(Row,1)));
        color.setText(String.valueOf(tabla.getValueAt(Row,3)));
        tamanio.setText(String.valueOf(tabla.getValueAt(Row,4)));
        textArea.setText(String.valueOf(tabla.getValueAt(Row,2)));
       // usuario.setText(String.valueOf(tabla.getValueAt(Row,5)));
       
   
}



//:::::::::::::::::::::::::CATEGORIA::::::::::::::::::::::::::::::::::::::
public void InsertarCategoria(String codigoCate,String nombreCategoria,String descripcionCate){
    String valor=obj_Consu_ProdCate.InsertarCategoria(codigoCate,nombreCategoria, descripcionCate);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
    }
}
public void ActualizarCategoria(String codigoCate,String nombreCategoria,String descripcionCate){
    
    String valor=obj_Consu_ProdCate.ActualizarCategoria(nombreCategoria, codigoCate, descripcionCate);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ALTUALIZAR");
    }
}

public void LlenadoAlComboCategoria(JComboBox combo){
    combo.removeAllItems();
    ResultSet rs;
   rs=obj_Consu_ProdCate.ConsultaCategoria();
    try {
        while(rs.next()){
            combo.addItem(rs.getString("categoria"));
        }
    } catch (Exception e) {
    }
    
}


//:::::::::::::::::::::::::FIN CATEGORIA::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::IGV::::::::::::::::::::::::::::::::::::::::::::
public void InsertarIgv(String codigo_igv,int porcentaje,String descripcion,String año){
      String valor=obj_Consu_ProdCate.InsertarIgv(codigo_igv,porcentaje,descripcion,año);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL INSERTAR");
    }
    
}
public void ActualizarIgv(String codigo_igv,int porcentaje,String descripcion,String año){
       String valor=obj_Consu_ProdCate.ActualizarIGV(codigo_igv,porcentaje,descripcion,año);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE ACTUALIZÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"OCURRIÓ PROBLEMAS AL ACTUALIZAR");
    }
    
    
}
//:::::::::::::::::::::::::FIN IGV::::::::::::::::::::::::::::::::::::::::
//:::::::::::::::::::::::::INICIO MARCA:::::::::::::::::::::::::::::::::::
public void LlenadoAlComboMarca(JComboBox combo){
    combo.removeAllItems();
    ResultSet rs;
   rs=obj_Consu_ProdCate.ConsultaMarca();
    try {
        while(rs.next()){
            combo.addItem(rs.getString("marca"));
        }
    } catch (Exception e) {
    }
}
//insertando marca
public void InsertarMarca(String codigo,String nombre,String descripcion){
    
    String valor=obj_Consu_ProdCate.InsertarMarca(codigo, nombre, descripcion);
    if(valor.equals("CORRECTO")){
        JOptionPane.showMessageDialog(null,"SE INSERTÓ CORRECTAMENTE");
    }
    else{
        JOptionPane.showMessageDialog(null,"ERROR AL INSERTAR");
    }
}
//:::::::::::::::::::::::::FIN MARCA::::::::::::::::::::::::::::::::::::::
    
}
