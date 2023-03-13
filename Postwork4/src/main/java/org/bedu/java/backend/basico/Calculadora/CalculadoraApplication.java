package org.bedu.java.backend.basico.Calculadora;

import org.bedu.java.backend.basico.Calculadora.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@Override
	public void run(String... args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nombre del contacto: ");
			String nombre = sc.nextLine();

			System.out.println("Teléfono del contacto: ");
			String telefono = sc.nextLine();

			Persona persona = new Persona(nombre, telefono);
			String contacto = """
					Contacto:
					Nombre: %s
					Teléfono: %s
					"""
					.formatted(persona.getNombre(), persona.getTelefono());

			System.out.println(contacto);
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
