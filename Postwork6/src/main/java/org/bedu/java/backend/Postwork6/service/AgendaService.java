package org.bedu.java.backend.Postwork6.service;

import org.bedu.java.backend.Postwork6.model.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    private final Agenda agenda;

    @Autowired
    public AgendaService(Agenda agenda) {
        this.agenda = agenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

}
