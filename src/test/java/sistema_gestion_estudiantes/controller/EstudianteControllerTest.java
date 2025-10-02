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
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EstudianteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testListarEstudiantesAPI() throws Exception {
        mockMvc.perform(get("/estudiantes"))
                .andExpect(status().isOk())                     // Verifica que responde 200 OK
                .andExpect(content().contentType("application/json")) // Verifica que responde JSON
                .andExpect(jsonPath("$").isArray());            // Verifica que devuelve un array JSON
    }
}
