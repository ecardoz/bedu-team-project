package org.bedu.java.backend.Postwork6.controller;

import org.bedu.java.backend.Postwork6.model.Persona;
import org.bedu.java.backend.Postwork6.service.AgendaService;
import org.bedu.java.backend.Postwork6.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {

    //Agregando services
    private final AgendaService agendaService;
    private final PersonaService personaService;

    @Autowired
    public PersonaController(AgendaService agendaService, PersonaService personaService) {
        this.agendaService = agendaService;
        this.personaService = personaService;
    }

    @GetMapping
    public String bienvenida() {
        return "Bienvenido a la API de personas";
    }

    @GetMapping("/agenda") //Endpoint para obtener la agenda con todas las personas
    public ResponseEntity<Set<Persona>> getAgenda() {
        return ResponseEntity.ok(agendaService.getAgenda().personas);
    }

    @PostMapping("/personas") //Endpoint para crear una persona
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        personaService.setPersona(persona);
        agendaService.getAgenda().agregarPersona(personaService.getPersona());
        return ResponseEntity.ok(personaService.getPersona());
    }
}
