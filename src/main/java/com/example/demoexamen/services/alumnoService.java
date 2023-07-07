package com.example.demoexamen.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoexamen.interfaceService.IalumnoService;
import com.example.demoexamen.interfaces.Ialumno;
import com.example.demoexamen.modelo.alumno;

@Service
public class alumnoService implements IalumnoService{
     @Autowired
    private Ialumno data;


    @Override
    public List<alumno> listar() {
       return (List<alumno>)data.findAll();
    }

    @Override
    public Optional<alumno> ListarId(int id) {
        return data.findById(id);

    }

    @Override
    public int save(alumno a) {
        int res=0;
        alumno alumno=data.save(a);
        if (!alumno.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);

    }
}
