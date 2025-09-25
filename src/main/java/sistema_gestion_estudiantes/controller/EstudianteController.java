/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.controller;

/**
 *
 * @author farivadi
 */
import sistema_gestion_estudiantes.model.Estudiante;
import sistema_gestion_estudiantes.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteRepository repository;

    public EstudianteController(EstudianteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return repository.save(estudiante);
    }
}
