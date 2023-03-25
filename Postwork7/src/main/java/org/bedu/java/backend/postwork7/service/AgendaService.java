package org.bedu.java.backend.postwork7.service;


import org.bedu.java.backend.postwork7.model.Persona;
import org.bedu.java.backend.postwork7.persistence.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;
    private final PersonaRepository personaRepository;


    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, PersonaRepository personaRepository) {
        this.validadorTelefono = validadorTelefono;
        this.personaRepository = personaRepository;
    }


    public Persona guardaPersona(Persona persona) {
        String telefono = validadorTelefono.limpiaNumero(persona.getTelefono());
        persona.setTelefono(telefono);
        return personaRepository.save(persona);
    }

    public List<Persona> getPersonas() {
        return personaRepository.findAll(Sort.by("nombre"));
    }

    public void deletePersona(Long id){
        personaRepository.deleteById(id);
    }
}
