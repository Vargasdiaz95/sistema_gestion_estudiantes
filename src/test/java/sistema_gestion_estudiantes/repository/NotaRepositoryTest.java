/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.repository;

/**
 *
 * @author farivadi
 */
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sistema_gestion_estudiantes.model.Estudiante;
import sistema_gestion_estudiantes.model.Nota;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class NotaRepositoryTest {
    @Autowired
    private EstudianteRepository estudianteRepository;  // <- Faltaba esto

    @Autowired
    private NotaRepository notaRepository;

    @Test
    void testGuardarNotasDeEstudiante() {
        // Crear estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Luis");
        estudiante.setCorreo("luis@mail.com");
        estudiante.setPrograma("Matemáticas");

        // Guardar estudiante en la base H2
        estudiante = estudianteRepository.save(estudiante);

        // Crear y guardar nota asociada al estudiante
        Nota nota = new Nota();
        nota.setValor(4.5);
        nota.setEstudiante(estudiante);

        notaRepository.save(nota);

        // Recuperar las notas por ID de estudiante
        List<Nota> notas = notaRepository.findByEstudianteId(estudiante.getId());

        // Validaciones
        assertFalse(notas.isEmpty(), "La lista de notas no debe estar vacía");
        assertEquals(4.5, notas.get(0).getValor(), "El valor de la nota debe ser 4.5");
    }
}
