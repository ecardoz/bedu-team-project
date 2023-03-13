package org.bedu.java.backend.session4.Postwork;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.bedu.java.backend.session4.Postwork.service.FormateadorTelefono;
import org.bedu.java.backend.session4.Postwork.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication implements CommandLineRunner {
	Scanner scanner = new Scanner(System.in);

	private final ValidadorTelefono validadorTelefono;
	private final FormateadorTelefono formateadorTelefono;

	@Autowired
	public PostworkApplication(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono){
		this.validadorTelefono = validadorTelefono;
		this.formateadorTelefono = formateadorTelefono;
	}

	public static void main(String[] args) {
		SpringApplication.run(PostworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese telefono");
		String telefono = scanner.nextLine();

		boolean isValid =
				validadorTelefono.isValido(telefono) & validadorTelefono.isValidTenDigits(telefono);

		while(!isValid){
			System.out.println(
					"Por favor, introduce un número válido a 10 dígitos\n" +
							"Solo se aceptan dígitos, separación por guión o espacios en blanco." +
							"Ejemplo de formatos aceptados:\n{\n" +
							"\t22-2222-2222\n" +
							"\t22 2222 2222\n}");

			telefono = scanner.nextLine();
			isValid = validadorTelefono.isValido(telefono) & validadorTelefono.isValidTenDigits(telefono);
		}
		telefono = validadorTelefono.limpiaNumero(telefono);
		telefono = formateadorTelefono.formatea(telefono);
		Persona persona = new Persona(nombre, telefono);
		System.out.println(persona);

	}
}
