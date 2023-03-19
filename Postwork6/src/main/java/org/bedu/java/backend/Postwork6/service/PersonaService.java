package org.bedu.java.backend.Postwork6.service;

import org.bedu.java.backend.Postwork6.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private Persona persona;

    @Autowired
    public PersonaService(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
