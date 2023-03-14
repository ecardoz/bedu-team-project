package org.bedu.java.backend.sesion5Postwork.service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidatePhone {

    private static final Pattern pattern = Pattern.compile("^[0-9\\-\\s]*$");
    public boolean validPhone(String phone){
        return pattern.matcher(phone).matches();
    }

    public String cleanPhone(String phone){
        return phone.replaceAll("[^0-9]", "");
    }

}
