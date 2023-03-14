package org.bedu.java.backend.sesion5Postwork;

import org.bedu.java.backend.sesion5Postwork.model.Person;
import org.bedu.java.backend.sesion5Postwork.service.FormatterPhone;
import org.bedu.java.backend.sesion5Postwork.service.ValidatePhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Sesion5PostworkApplication implements CommandLineRunner {
	private final ValidatePhone validatePhone;
	private final FormatterPhone formatterPhone;


	public Sesion5PostworkApplication(@Autowired ValidatePhone validatePhone, FormatterPhone formatterPhone) {
		this.validatePhone = validatePhone;
		this.formatterPhone = formatterPhone;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5PostworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el nombre");
		String firstName = scanner.nextLine();

		System.out.println("Introduce el apellido0");
		String lastName = scanner.nextLine();

		System.out.println("Introduce el numero telefonico (Solo se permiten numeros, guion medio y espacios en blanco)");
		String phone = scanner.nextLine();

		scanner.close();

		if(validatePhone.validPhone(phone)){
			phone = validatePhone.cleanPhone(phone);
			phone = formatterPhone.format(phone);

			Person person = new Person(firstName, lastName, phone);
			System.out.println(person);
		} else {
			System.out.println("Introduce un numero de telefono va0lido.");
		}

	}
}
