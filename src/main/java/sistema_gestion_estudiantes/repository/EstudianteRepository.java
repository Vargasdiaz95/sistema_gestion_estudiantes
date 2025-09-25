/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.repository;

/**
 *
 * @author farivadi
 */

import sistema_gestion_estudiantes.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
}
