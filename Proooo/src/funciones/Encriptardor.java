/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author NAVARRO
 */
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
