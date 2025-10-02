/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.controller;

/**
 *
 * @author farivadi
 */
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EstudianteAceptacionTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testRegistrarYConsultarEstudiante() throws Exception {
        // 1. Registrar un nuevo estudiante (POST)
        mockMvc.perform(post("/estudiantes")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nombre\":\"Ana\",\"correo\":\"ana@mail.com\",\"programa\":\"Ingeniería\"}"))
                .andExpect(status().isOk());

        // 2. Consultar lista de estudiantes (GET)
        mockMvc.perform(get("/estudiantes"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$[0].nombre").value("Ana"))
                .andExpect(jsonPath("$[0].correo").value("ana@mail.com"))
                .andExpect(jsonPath("$[0].programa").value("Ingeniería"));
    }
}
