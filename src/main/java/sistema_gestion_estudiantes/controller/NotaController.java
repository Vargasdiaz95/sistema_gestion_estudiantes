/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_estudiantes.controller;

/**
 *
 * @author farivadi
 */
import sistema_gestion_estudiantes.model.Nota;
import sistema_gestion_estudiantes.repository.NotaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {
    private final NotaRepository repository;

    public NotaController(NotaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Nota> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Nota crear(@RequestBody Nota nota) {
        return repository.save(nota);
    }
}
