
package funciones;

import com.mysql.jdbc.Util;
import consultas.Consu_Logue_usua;
import consultas.Consu_Usuario;
import consultas.Consu_tien;
import getters_setters.usuario_Getters_setters;
import java.awt.Image;
import java.sql.Blob;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class func_Logue {
    
    Consu_Logue_usua funcionLog;
    Encriptardor encripta;
    Consu_tien obj_Consu_tien;
    public func_Logue() {
        obj_Consu_tien=new Consu_tien();
        funcionLog=new Consu_Logue_usua();
        encripta=new Encriptardor();
    }
 public void Loguearse(String usuario, String contr,String nivel, JFrame ventana,int cont_log, JFrame vist_logue,JLabel etiqueta,String sede){
  //optener codigoSede
     String codigoSede=obj_Consu_tien.RetornarCodigoSede(sede);
     
     //encriptamos contraseña
     
     String valor= funcionLog.estadoUsuario(usuario,encripta.Encripta(contr),nivel,codigoSede);
    //System.out.println(valor);
    if(valor.equals("activo")|| valor.equals("ACTIVO")){
        
         ventana.setVisible(true);
         vist_logue.dispose();
    }
    else{
        cerrarLogueo(cont_log, vist_logue);
        etiqueta.setText("DATOS INCORRECTOS, TE QUEDAN "+ cont_log+" INTENTOS");
    }
 }
 public void llenarCargo(JComboBox combo){
      combo.removeAllItems();
      
      try {
          ResultSet rs=funcionLog.consultaCargo();
          while(rs.next()){
              combo.addItem(rs.getString("nomb_carg"));
              
          }
         
     } catch (Exception e) {
     }
     
 }
 public String DevolverDni(String usuario,String contra){
     return funcionLog.RecuperarDni(usuario,encripta.Encripta(contra));
 }
 
 public void cerrarLogueo(int n, JFrame obj){
     if(n==0){
         System.exit(obj.EXIT_ON_CLOSE);
     }
     
 }
 
 public void borraCampos(JTextField campo1, JPasswordField campo2){
     campo1.setText("");
     campo2.setText("");
     
 }
 public void imagenUsuario(String dni,JLabel label){
     Consu_Usuario obj =new Consu_Usuario();
     func_imagen obj_image=new func_imagen();
     Blob blob=obj.RetornarByteImagen(dni);
     ImageIcon icono=new ImageIcon(obj_image.RetornarImagen(blob).getScaledInstance(150, 150,Image.SCALE_SMOOTH));
     
    label.setIcon(icono);
     
 }
    
}
