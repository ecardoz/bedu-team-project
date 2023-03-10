package org.bedu.java.backend.sesion5Postwork.service;

import org.springframework.stereotype.Service;

@Service
public class FormatterPhone {

    private static final String initialFormat = "(\\d{2})(\\d{4})(\\d{4})";
    private static final String finalFormat = "($1)-$2-$3";

    public String format(String phone){
        return String.valueOf(phone).replaceFirst(initialFormat, finalFormat);
    }
}
