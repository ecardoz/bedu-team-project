package com.bedu.java.backend.basico.Postwork5.service;

import com.bedu.java.backend.basico.Postwork5.model.Persona;
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

}
