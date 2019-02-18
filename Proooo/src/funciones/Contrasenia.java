/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author NAVARRO
 */
public class Contrasenia {
    
 public String Validar(String valor1,String valor2){
     String Retornar="";
     if(valor1.equals(valor2)){
         Retornar="CORRECTO";
     }
     else{
         Retornar="INCORRECTO";
     }
     return Retornar;
 }
    
}
