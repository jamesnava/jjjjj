/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import consultas.Consu_Duen;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author NAVARRO
 */
public class func_Duen_Regis {
 
    Consu_Duen obj_dueno;
    public func_Duen_Regis(){
        obj_dueno=new Consu_Duen();
    }
    public void registrarDueño(String dni,String nombre,String apellidoP,String apellidoM,String correo,String usuario, String contra,String contra1){
        
        if(contra.equals(contra1)){
            //ecriptamos la contraseña...
            Encriptardor obj_encriptador=new Encriptardor();
            String hastext=obj_encriptador.Encripta(contra);
            
            obj_dueno.InsertarDueno(dni, nombre, apellidoP, apellidoM, correo, usuario, hastext);
        }
        else{
            JOptionPane.showMessageDialog(null,"LA CONTRASEÑA NO COINCIDE");
        }
    }
    // consultar si ya se registro el dueño...
    public String RegistroNoRegistro(){
        int valor=obj_dueno.ConsultaDueno();
        String Registro="";
        if(valor==1){
            Registro="REGISTRO";
        }
        else{
            Registro="NOREGISTRO";
        }
        return Registro;
    }
            
    
    //:::::::::::::::::::::::::::::::::::REGISTRO TIENDA:::::::::::::::::::::::::::::::::::::::::::::::
    public void registroTienda(String ruc, String nombreT, String sitioWeb){
        obj_dueno.insertarTienda(ruc, nombreT, sitioWeb);
        
    }
    //::::::::::::::::::::::::::::::::::REGISTRO TIENDA::::::::::::::::::::::::::::::::::::::::::::::::
    // cargo.......................
    public void LlenarComboCargo(JComboBox combo){
     ResultSet rs=obj_dueno.RetornarNombreCargo();
    combo.removeAllItems();
    try {
         while(rs.next()){
        combo.addItem(rs.getString("NombreCargo"));
             //System.out.println(rs.getString("nomb"));
        
    }
    }
    catch (Exception e) {
        System.out.println(e);
    }
    }
    
    //fin cargo....................
    public void BorrarCampos(JTextField campo1,JTextField campo2,JTextField campo3, JTextField campo4,JTextField campo5, JTextField campo6, JPasswordField contra1, JPasswordField contra2){
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        contra1.setText("");
        contra2.setText("");
        
    }
    
    
}
