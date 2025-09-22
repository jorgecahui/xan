package com.example.ahcccursos.Service.Imp;

import com.example.ahcccursos.Entity.Cursos;
import com.example.ahcccursos.Repository.CursoRepository;
import com.example.ahcccursos.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    @Override
    public List<Cursos> listar() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Cursos> buscarPorId(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Cursos guardar(Cursos cursos) {
        return cursoRepository.save(cursos);
    }

    @Override
    public Cursos actualizar(Cursos cursos) {
        return cursoRepository.save(cursos);
    }

    @Override
    public void borrarPorId(Integer id) {
         cursoRepository.deleteById(id);

    }
}
