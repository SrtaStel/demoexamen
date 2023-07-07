package com.example.demoexamen.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demoexamen.modelo.alumno;

public interface IalumnoService {
    public List<alumno>listar();
    public Optional<alumno>ListarId(int id);
    public int save(alumno a);
    public void eliminar (int id);
    
}
