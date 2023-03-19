package org.bedu.java.backend.Postwork6.model;

import org.bedu.java.backend.Postwork6.errors.ErrorManager;
import org.bedu.java.backend.Postwork6.utils.Utils;
import org.springframework.stereotype.Component;

@Component
public class Telefono {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero){
        if (!Utils.isPhoneWithCharactersValid(numero))
            throw new ErrorManager("\nEl campo del teléfono puede contener unicamente números, guion medio y espacios en blanco!");

        if (!Utils.isPhoneWithTenNumbers(numero))
            throw new ErrorManager("\nEl campo del teléfono debe contener 10 números!");

        this.numero = Utils.formatPhone(numero);
    }
}
