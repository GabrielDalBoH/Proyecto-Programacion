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
    private static String nombre_;
    private static String apellido_;
    private static String nacimiento_;
    private static String sexo_;
    private static String domicilio_;
    private static String nacionalidad_;
    private static String ciudad_;
    private static String lugardenacimiento_;
    
    
    
    public void setNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    public static String getNombre() {
        return nombre_;
    }

    public void setApellido(String apellido_) {
        this.apellido_ = apellido_;
    }

    public static String getApellido() {
        return apellido_;
    }

    public void setSexo(String sexo_) {
        this.sexo_ = sexo_;
    }

    public static String getSexo() {
        return sexo_;
    }
    public void setNacimiento(String nacimiento_) {
        this.nacimiento_ = nacimiento_;
    }

    public static String getNacimiento() {
        return nacimiento_;
    }
    public void setDomicilio(String domicilio_) {
        this.domicilio_ = domicilio_;
    }

    public static String getDomicilio() {
        return domicilio_;
    }
    public void setCiudad(String ciudad_) {
        this.ciudad_ = ciudad_;
    }

    public static String getCiudad() {
        return ciudad_;
    }
    public void setLugarDeNacimiento(String lugardenacimiento_) {
        this.lugardenacimiento_ = lugardenacimiento_;
    }

    public static String getLugarDeNacimiento() {
        return lugardenacimiento_;
    }
    public void setNacionalidad(String nacionalidad_) {
        this.nacionalidad_ = nacionalidad_;
    }

    public static String getNacionalidad() {
        return nacionalidad_;
}
}