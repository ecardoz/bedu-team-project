package org.bedu.java.backend.sesion5.postwork5;

import org.bedu.java.backend.sesion5.postwork5.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Postwork5Application implements CommandLineRunner {

	private Persona persona;

	public Postwork5Application(Persona persona) {
		this.persona = persona;
	}

	public static void main(String[] args) {
		SpringApplication.run(Postwork5Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa tu nombre: ");
		String nombre = scanner.nextLine();

		System.out.println("Ingresa tu apellido: ");
		String apellido = scanner.nextLine();


		System.out.println("Ingresa tu numero de telefono");
		String telefono = scanner.nextLine();
		if (telefono.matches("\\d{3}[ -]?\\d{3}[ -]?\\d{4}")) {

			System.out.println("Numero valido " + telefono);

			String reemplazaTel = telefono.replaceAll("[^0-9]", "");
			String formateado = String.format("(%s)-%s-%s", reemplazaTel.substring(0, 2), reemplazaTel.substring(2, 6), reemplazaTel.substring(6, 10));

			persona.setTelefono(formateado);
			persona.setNombre(nombre);
			persona.setApellido(apellido);

			System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido() + " tu numero de telefono es " + persona.getTelefono());

		} else {
			System.out.println("Numero invalido, asegurate que sean 10 digitos en el siguiente formato ###-###-####");
		}
	}
}
