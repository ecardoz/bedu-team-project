package com.bedu.java.backend.basico.Postwork5;

import com.bedu.java.backend.basico.Postwork5.service.PersonaService;
import com.bedu.java.backend.basico.Postwork5.service.TelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork5Application implements CommandLineRunner {

	private final PersonaService personaService;
	private final TelefonoService telefonoService;

	@Autowired
	public Postwork5Application(PersonaService personaService, TelefonoService telefonoService) {
		this.personaService = personaService;
		this.telefonoService = telefonoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Postwork5Application.class, args);
	}

	@Override
	public void run(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nombre del contacto: ");
			String nombre = sc.nextLine();

			System.out.println("Teléfono del contacto: ");
			String telefono = sc.nextLine();

			telefonoService.getTelefono().setNumero(telefono);
			personaService.getPersona().setNombre(nombre);
			personaService.getPersona().setTelefono(telefonoService.getTelefono());

			String contacto = """
					\nContacto agregado:
					Nombre: %s
					Teléfono: %s
					"""
					.formatted(personaService.getPersona().getNombre(),
							   personaService.getPersona().getTelefono().getNumero());

			System.out.println(contacto);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
