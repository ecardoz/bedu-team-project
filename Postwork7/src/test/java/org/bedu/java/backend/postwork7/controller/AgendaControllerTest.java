package org.bedu.java.backend.postwork7.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bedu.java.backend.postwork7.model.Persona;
import org.bedu.java.backend.postwork7.service.AgendaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AgendaController.class)
class AgendaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private AgendaService agendaService;

    @Test
    void formularioRegistro() throws Exception {
        this.mockMvc
                .perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("persona"))
                .andExpect(view().name("index"));
    }

    @Test
    void verRegistros() throws Exception {
        this.mockMvc
                .perform(get("/contacto/all"))
                .andExpect(status().isOk())
                .andExpect(view().name("listaContactos"));
    }

    @Test
    void registra() throws Exception {
        Persona persona = new Persona("FulanitoTest", "1234567890");
        this.mockMvc
                .perform(post("/registro")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(persona)))
                .andExpect(status().isOk());
    }
}