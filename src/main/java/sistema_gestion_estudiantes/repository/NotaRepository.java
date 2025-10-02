/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.repository;

/**
 *
 * @author farivadi
 */
import org.springframework.data.jpa.repository.JpaRepository;
import sistema_gestion_estudiantes.model.Nota;
import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Long> {
    List<Nota> findByEstudianteId(Long estudianteId);
}
