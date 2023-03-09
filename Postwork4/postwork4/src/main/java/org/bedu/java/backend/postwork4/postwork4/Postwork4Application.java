package org.bedu.java.backend.postwork4.postwork4;

import org.bedu.java.backend.postwork4.postwork4.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork4Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Postwork4Application.class, args);
	}
	private Persona persona;

	public Postwork4Application(Persona persona) {
		this.persona = persona;
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();

		System.out.println("Ingresa tu apellido: ");
		String apellido = scanner.nextLine();

		persona.setNombre(nombre);
		persona.setApellido(apellido);

		System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido());
	}

}
