
package funciones;
import consultas.Consu_Usuario;
import javax.swing.JOptionPane;
public class func_Usua {
    Consu_Usuario obj_Consu_Usua;
    Encriptardor encriptar;
public func_Usua(){
    obj_Consu_Usua=new Consu_Usuario();
    encriptar=new Encriptardor();
    
}
public void InsertarUsuario(String dni,String nombre,String apellidoP,String direccion,String telefono,String correo,String usuario,String contrasenia,String sucursal,String apellidoM,String estado,String cargo){
    String contraseniaEncriptada=encriptar.Encripta(contrasenia);
    
    String valor=obj_Consu_Usua.InsertarUsuario(dni, nombre, apellidoP, direccion, telefono, correo, usuario, contraseniaEncriptada, sucursal, apellidoM, estado, cargo);
    if(valor.equals("CORRECTO")){  
        JOptionPane.showMessageDialog(null,"Se Insertó Correctamente");
    }
    else{
        JOptionPane.showMessageDialog(null,"Problemas Al Insertar");
    }
    }
    
}
