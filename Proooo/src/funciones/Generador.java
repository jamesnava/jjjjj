package funciones;

import consultas.Consu_Abast;
import consultas.Consu_ProdCate;
import java.util.Random;

public class Generador {
 public String Generar(){
     String cadenaGenerada="";
     int i=0;
     Random aleatorio=new Random();
     while(i<18){
         int numero=aleatorio.nextInt(10);
        // System.out.println("ee: "+numero);
         cadenaGenerada=cadenaGenerada+RetornarLetra(numero);
         i++;
     }
     return cadenaGenerada;
 }
 public String RetornarLetra(int n){
     String valor="";
     switch(n){
         case 1:
             valor="A";
             break;
         case 2:
             valor="B";
             break;
         case 3:
             valor="C";
             break;
         case 4:
             valor="D";
             break;
         case 5:
             valor="E";
             break;
         case 6:
             valor="F";
             break;
         case 7:
             valor="G";
             break;
         case 8:
             valor="H";
             break;
         case 9:
             valor="I";
             break;
         case 0:
             valor="Z";
             break;
     }
     return valor;
 }
 public String validar(){
     String valido="";
     
     boolean valor=true;
     
     while(valor){
     Consu_ProdCate obj_consu_ProdCate=new Consu_ProdCate();
     String codigo=Generar();
     boolean condicion =obj_consu_ProdCate.ConsultaIdCategoria(codigo);
     valido=codigo;
     valor=condicion;
         System.out.println("codigo "+codigo);
         System.out.println("comprobar: "+condicion);
         
     }
    return valido; 
 }
}
