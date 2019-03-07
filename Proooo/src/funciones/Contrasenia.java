
package funciones;


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
