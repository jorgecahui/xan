package com.example.ahcccursos.Controller;

import com.example.ahcccursos.Entity.Cursos;
import com.example.ahcccursos.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Cursos")
public class CursosController {
    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<Cursos> listar() {
        return cursoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Cursos> buscarPorId(@PathVariable Integer id) {
        return cursoService.buscarPorId(id);
    }

    @PostMapping
    public Cursos guardar(Cursos cursos) {
        return cursoService.guardar(cursos);
    }

    @PutMapping
    public Cursos actualizar(Cursos cursos) {
        return cursoService.actualizar(cursos);
    }

    @DeleteMapping
    public String eliminar(@PathVariable Integer id) {
        cursoService.borrarPorId(id);
        return "Categoria eliminada";
    }
}
