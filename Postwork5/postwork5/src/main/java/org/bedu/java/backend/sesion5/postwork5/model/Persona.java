package org.bedu.java.backend.sesion5.postwork5.model;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
