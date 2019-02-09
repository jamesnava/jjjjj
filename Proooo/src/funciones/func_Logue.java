/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import com.mysql.jdbc.Util;
import consultas.Consu_Logue_usua;
import getters_setters.usuario_Getters_setters;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author NAVARRO
 */
public class func_Logue {
    
    Consu_Logue_usua funcionLog;
    public func_Logue() {
        
        funcionLog=new Consu_Logue_usua();
    }
 public void Loguearse(String usuario, String contr,String nivel, JFrame ventana,int cont_log, JFrame vist_logue,JLabel etiqueta){
   //encriptamos contraseña
     
     String valor= funcionLog.estadoUsuario(usuario,contr,nivel);
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
 
 public void cerrarLogueo(int n, JFrame obj){
     if(n==0){
         System.exit(obj.EXIT_ON_CLOSE);
     }
     
 }
 public void borraCampos(JTextField campo1, JPasswordField campo2){
     campo1.setText("");
     campo2.setText("");
     
 }
    
}
