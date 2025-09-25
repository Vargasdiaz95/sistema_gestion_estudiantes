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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    private final EstudianteRepository repository;

    public WebController(EstudianteRepository repository) {
        this.repository = repository;
    }

    // Página principal con lista de estudiantes
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("estudiantes", repository.findAll());
        return "index"; // Llama a index.html
    }

    // Guardar estudiante desde formulario
    @PostMapping("/agregar")
    public String agregar(@ModelAttribute Estudiante estudiante) {
        repository.save(estudiante);
        return "redirect:/";
    }
}
