package org.bedu.java.backend.Postwork6.model;


import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.TreeSet;

@Component
public class Agenda {

    private static Agenda agenda;
    public static Set<Persona> personas;

    private Agenda() {
        personas = new TreeSet<>();
    }

    public static Agenda getAgenda() {
        if (agenda == null) {
            agenda = new Agenda();
        }

        return agenda;
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

}
