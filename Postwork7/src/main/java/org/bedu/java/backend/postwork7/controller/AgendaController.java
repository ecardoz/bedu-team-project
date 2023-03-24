package org.bedu.java.backend.postwork7.controller;

import jakarta.validation.Valid;
import org.bedu.java.backend.postwork7.model.Persona;
import org.bedu.java.backend.postwork7.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AgendaController {
    private final AgendaService agendaService;

    @Autowired
    public AgendaController(AgendaService agendaService) {

        this.agendaService = agendaService;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        model.addAttribute("persona", new Persona());
        return "index";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {
        Persona personaDB = agendaService.guardaPersona(persona);
        String vistaResultado = "listaContactos";
        String mensajeConfirmacion = "Contacto guardado correctamente";

        if (errors.hasErrors()) {
            vistaResultado = "index";
            mensajeConfirmacion = "Contacto no guardado";
        }

        ModelAndView mav = new ModelAndView(vistaResultado);
        mav.addObject("persona", personaDB);
        if (!mensajeConfirmacion.isEmpty()) {
            mav.addObject("mensajeConfirmacion", mensajeConfirmacion);
        }
        return mav;
    }

    @GetMapping("/directorio")
    public ModelAndView directorioContacto() {
        List<Persona> listaPersonas = agendaService.getPersonas();
        ModelAndView mav = new ModelAndView("directorio-contactos");
        mav.addObject("listaPersonas", listaPersonas);

        return mav;
    }
}
