package org.bedu.java.backend.Postwork6.controller;

import org.bedu.java.backend.Postwork6.model.Persona;
import org.bedu.java.backend.Postwork6.model.Telefono;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario/")
public class UsuarioController {

    @GetMapping
    public String bienvenida() {
        System.out.println("Bienvenido a la API de usuarios");
        return "Bienvenido a la API de usuarios";
    }

    @PostMapping
    public Persona crearUsuario(@RequestBody Persona persona) {

        System.out.println("Persona: " + persona.getNombre());

        Telefono telefono = new Telefono();
        telefono.setNumero("55-55-555 555");

        persona.setTelefono(telefono);
        persona.setNombre("Hiram");

        return persona;
    }
}
