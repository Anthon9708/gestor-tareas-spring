package com.portfolio.gestor_tareas.controller;

import com.portfolio.gestor_tareas.model.Tarea;
import com.portfolio.gestor_tareas.repository.TareaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaRepository repository;

    public TareaController(TareaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarea> obtenerTodas() {
        return repository.findAll();
    }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea nuevaTarea){
        return repository.save(nuevaTarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tareaActualizada){
        return repository.findById(id)
                .map(tarea -> {
                    tarea.setTitulo(tareaActualizada.getTitulo());
                    tarea.setCompletada(tareaActualizada.isCompletada());
                    return repository.save(tarea);
                })
                .orElse(null);
    }


}
