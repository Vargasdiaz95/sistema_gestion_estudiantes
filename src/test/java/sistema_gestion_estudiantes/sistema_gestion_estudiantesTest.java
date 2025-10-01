package sistema_gestion_estudiantes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import sistema_gestion_estudiantes.model.Estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class sistema_gestion_estudiantesTest {

	@Test
    public void testCrearEstudiante() {
        Estudiante est = new Estudiante();
        est.setNombre("Juan Pérez");
        est.setCorreo("juan@correo.com");
        est.setPrograma("Ingeniería de Sistemas");

        assertEquals("Juan Pérez", est.getNombre());
        assertEquals("juan@correo.com", est.getCorreo());
        assertEquals("Ingeniería de Sistemas", est.getPrograma());
    }

}
