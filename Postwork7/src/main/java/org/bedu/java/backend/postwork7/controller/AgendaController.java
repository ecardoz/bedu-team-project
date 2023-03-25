package org.bedu.java.backend.postwork7.controller;

import jakarta.validation.Valid;
import org.bedu.java.backend.postwork7.model.Persona;
import org.bedu.java.backend.postwork7.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
        String vistaResultado = "listaContactos";
        String mensajeConfirmacion = "Contacto guardado correctamente";
        if (errors.hasErrors()) {
            vistaResultado = "index";
            mensajeConfirmacion = "Contacto no guardado";
        }else{
            agendaService.guardaPersona(persona);
        }
        ModelAndView mav = new ModelAndView(vistaResultado);
        mav.addObject("listaPersonas", agendaService.getPersonas());
        mav.addObject("mensajeConfirmacion", mensajeConfirmacion);
        return mav;
    }

    @GetMapping("/contacto/all")
    public ModelAndView verRegistros(){
        ModelAndView mav = new ModelAndView("listaContactos");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }

    @GetMapping("/contacto/delete/{id}")
    public ModelAndView deleteContacto(@PathVariable Long id){
        ModelAndView mav = new ModelAndView("listaContactos");
        mav.addObject("mensajeConfirmacion", "El contacto ha sido eliminado");
        agendaService.deletePersona(id);
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }
}
