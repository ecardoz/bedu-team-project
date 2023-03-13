package com.bedu.java.backend.basico.Postwork5.service;

import com.bedu.java.backend.basico.Postwork5.model.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefonoService {
    private Telefono telefono;

    @Autowired
    public TelefonoService(Telefono telefono) {
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
