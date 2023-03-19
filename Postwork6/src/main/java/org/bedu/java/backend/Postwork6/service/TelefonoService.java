package org.bedu.java.backend.Postwork6.service;

import org.bedu.java.backend.Postwork6.model.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefonoService {
    private final Telefono telefono;

    @Autowired
    public TelefonoService(Telefono telefono) {
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }

}
