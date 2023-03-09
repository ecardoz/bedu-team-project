package org.bedu.java.backend.session4.Postwork.controller;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class PersonaController implements CommandLineRunner {
    Scanner scanner = new Scanner(System.in);

    Persona persona = new Persona();

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);
        System.out.println("Ingrese telefono");
        String telefono = scanner.nextLine();
        persona.setTelefono(telefono);


        System.out.println(persona);
    }
}
