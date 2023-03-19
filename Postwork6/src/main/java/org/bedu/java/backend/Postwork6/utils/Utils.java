package org.bedu.java.backend.Postwork6;

public class Utils {

    //Solo debe contener caracteres válidos: números, guion medio y espacio en blanco
    public static boolean isPhoneWithCharactersValid(String telefono) {
        return telefono.matches("[^a-zA-Z]+\s*-*");
    }

    //Solo debe contener 10 números
    public static boolean isPhoneWithTenNumbers(String telefono) {
        String onlyNumbers = getOnlyNumbers(telefono);
        return onlyNumbers.matches("[0-9]{10}");
    }

    //Formateando el telefono: (55)-5555-5555
    public static String formatPhone(String telefono) {
        String onlyNumbers = getOnlyNumbers(telefono);
        String firstPart = onlyNumbers.substring(0, 2);
        String secondPart = onlyNumbers.substring(2, 6);
        String thirdPart = onlyNumbers.substring(6, 10);
        return "(" + firstPart + ")" + "-" + secondPart + "-" + thirdPart;
    }

    //Dejando solo los numeros
    private static String getOnlyNumbers(String telefono) {
        return telefono.replaceAll("[^0-9]", "");
    }

}
