
package funciones;

import java.math.BigInteger;
import java.security.MessageDigest;


public class Encriptardor {
    public String Encripta(String texto){
        String hashtext="";
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte [] messageDigest=md.digest(texto.getBytes());
            BigInteger numero=new BigInteger(1,messageDigest);
            hashtext=numero.toString(16);
            while(hashtext.length()<32){
                hashtext="0"+hashtext;
                
            }
            
        } catch (Exception e) {
            
        }
        return hashtext;
    }
    
}
