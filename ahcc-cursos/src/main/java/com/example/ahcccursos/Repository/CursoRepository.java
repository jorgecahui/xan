package com.example.ahcccursos.Repository;

import com.example.ahcccursos.Entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Cursos,Integer> {
}
