package com.example.demoexamen.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoexamen.interfaceService.IalumnoService;
import com.example.demoexamen.modelo.alumno;

@Controller
@RequestMapping

public class controlador {
    @Autowired
    private IalumnoService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<alumno>alumnos=service.listar();
        model.addAttribute("alumnos", alumnos);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("alumno", new alumno());
        return "form";
    }

      @PostMapping("/save")
    public String save(alumno a, Model model){
        service.save(a);
        return "redirect:/listar";
    }
     @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<alumno>alumno=service.ListarId(id);
               model.addAttribute("alumno",alumno);
        return "form";
    }
     @GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.eliminar(id);
		return "redirect:/listar";
    }
}

