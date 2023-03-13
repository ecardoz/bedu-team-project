package org.bedu.java.backend.session4.Postwork.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidadorTelefono {

    static String patterns = "^(\\d{2,4}[- ]?){2}\\d{4}$";
    private static final Pattern PATTERN_TELEFONO = Pattern.compile(patterns);


    public boolean isValido(String telefono){
        return PATTERN_TELEFONO.matcher(telefono).matches();
    }

    public boolean isValidTenDigits(String telefono) {
        telefono = limpiaNumero(telefono);

        return (telefono.length()==10);
    }

    public String limpiaNumero(String telefono) {
        return telefono.replaceAll("[^0-9]", "");
    }

}
