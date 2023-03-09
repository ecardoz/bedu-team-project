package org.bedu.java.backend.session4.Postwork.model;

public class Persona {

    private String nombre;
    private String telefono;

    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre +
                "', telefono='" + telefono + "'}";
    }
}
