package org.bedu.java.backend.postwork6;

import org.bedu.java.backend.postwork6.model.Persona;
import org.bedu.java.backend.postwork6.service.FormateadorTelefono;
import org.bedu.java.backend.postwork6.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Postwork6Application implements CommandLineRunner {

	private final ValidadorTelefono validadorTelefono;
	private final FormateadorTelefono formateadorTelefono;

	@Autowired
	public Postwork6Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono) {
		this.validadorTelefono = validadorTelefono;
		this.formateadorTelefono = formateadorTelefono;
	}

	public static void main(String[] args) {
		SpringApplication.run(Postwork6Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Ingresa el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Ingresa el telefono: ");
		String telefono = reader.nextLine();

		if (validadorTelefono.isValido(telefono)) {
			telefono = validadorTelefono.limpiaNumero(telefono);
			telefono = formateadorTelefono.formatea(telefono);

			Persona persona = new Persona(nombre, telefono);

			System.out.println(persona);
		} else {
			System.out.println("!Telefono invalido! \n Introduce los 10 digitos con el siguiente formato ##-####-####");
		}
	}
}
