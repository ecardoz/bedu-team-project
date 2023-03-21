package org.bedu.java.backend.postwork7.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidadorTelefono {

    public String limpiaNumero(String telefono){
        return telefono.replaceAll("[^0-9]", "");
    }
}
