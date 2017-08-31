/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

/**
 *
 * @author gino
 */
public class Persona {
    private  String nombre_;
    private  String apellido_;
    private  String nacimiento_;
    private  String sexo_;
    private  String domicilio_;
    private  String nacionalidad_;
    private  String ciudad_;
    private  String lugardenacimiento_;
    
    
    
    
    public void setNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    public  String getNombre() {
        return nombre_;
    }

    public void setApellido(String apellido_) {
        this.apellido_ = apellido_;
    }

    public  String getApellido() {
        return apellido_;
    }

    public void setSexo(String sexo_) {
        this.sexo_ = sexo_;
    }

    public  String getSexo() {
        return sexo_;
    }
    public void setNacimiento(String nacimiento_) {
        this.nacimiento_ = nacimiento_;
    }

    public  String getNacimiento() {
        return nacimiento_;
    }
    public void setDomicilio(String domicilio_) {
        this.domicilio_ = domicilio_;
    }

    public String getDomicilio() {
        return domicilio_;
    }
    public void setCiudad(String ciudad_) {
        this.ciudad_ = ciudad_;
    }

    public  String getCiudad() {
        return ciudad_;
    }
    public void setLugarDeNacimiento(String lugardenacimiento_) {
        this.lugardenacimiento_ = lugardenacimiento_;
    }

    public  String getLugarDeNacimiento() {
        return lugardenacimiento_;
    }
    public void setNacionalidad(String nacionalidad_) {
        String nacionalidad = "";
        for (int i = 4 ; i < nacionalidad_.length(); i++){
            nacionalidad += nacionalidad_.charAt(i);
        }
        this.nacionalidad_ = nacionalidad;
    }

    public  String getNacionalidad() {
        return nacionalidad_;
}
}