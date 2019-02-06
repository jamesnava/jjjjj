/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getters_setters;

/**
 *
 * @author NAVARRO
 */
public class usuario_Getters_setters {
    String apellidoPaterno;
    String apellidoMaterno;
    String nombre;
    String direccion;
    String telefono;
    String usuario;
    String contra;
    String estado;

    public usuario_Getters_setters() {
        this.apellidoPaterno ="";
        this.apellidoMaterno = "";
        this.direccion = "";
        this.telefono = "";
        this.usuario = "";
        this.contra ="";
        this.estado="";
        
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getEstado(){
        return estado;
    }     
    
    
}
