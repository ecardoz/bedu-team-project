package org.bedu.java.backend.Postwork6.model;

import org.springframework.stereotype.Component;

@Component
public class Persona implements Comparable<Persona> {
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

    @Override
    public boolean equals(Object obj) {
        Persona persona = (Persona) obj;
        return this.nombre.equals(persona.getNombre());
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
