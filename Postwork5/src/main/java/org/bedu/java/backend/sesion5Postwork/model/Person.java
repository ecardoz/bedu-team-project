package org.bedu.java.backend.sesion5Postwork.model;

public class Person {
    private String firstName;
    private String lastName;
    private String phone;

    public Person(){
    }

    public Person(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + firstName + '\'' + ", apellido='" + lastName + '\'' + ", telefono='" + phone + '\'' + '}';
    }
}
