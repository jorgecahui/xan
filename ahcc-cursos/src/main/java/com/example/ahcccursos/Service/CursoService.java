package com.example.ahcccursos.Service;

import com.example.ahcccursos.Entity.Cursos;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Cursos> listar();
    Optional<Cursos> buscarPorId(Integer id);
    Cursos guardar(Cursos cursos);
    Cursos actualizar(Cursos cursos);
    void borrarPorId(Integer id);
}
