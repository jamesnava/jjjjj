/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import consultas.Consu_Logue_usua;
import getters_setters.usuario_Getters_setters;
import javax.swing.JOptionPane;

/**
 *
 * @author NAVARRO
 */
public class func_Logue {
    
    Consu_Logue_usua funcionLog;
    public func_Logue() {
        
        funcionLog=new Consu_Logue_usua();
    }
 public void Loguearse(String usuario, String contr){
    String valor= funcionLog.estadoUsuario(usuario,contr);
    System.out.println(valor);
    if(valor.equals("activo")|| valor.equals("ACTIVO")){
        JOptionPane.showMessageDialog(null,"acceso correcto");
    }
    else{
        JOptionPane.showMessageDialog(null,"incorrecto");
    }
 }
    
}
