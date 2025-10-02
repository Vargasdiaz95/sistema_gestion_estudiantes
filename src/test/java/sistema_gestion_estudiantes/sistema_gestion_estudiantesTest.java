package sistema_gestion_estudiantes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import sistema_gestion_estudiantes.model.Estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class sistema_gestion_estudiantesTest {
    @Test
    void testCrearEstudiante() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Ana");
        estudiante.setCorreo("ana@mail.com");
        estudiante.setPrograma("Ingeniería");
        
        assertEquals("Ana", estudiante.getNombre());
        assertEquals("ana@mail.com", estudiante.getCorreo());
        assertEquals("Ingeniería", estudiante.getPrograma());
    }
}
