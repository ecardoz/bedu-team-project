package com.bedu.java.backend.basico.Postwork5.model;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    private String nombre;
    private Telefono telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
}
