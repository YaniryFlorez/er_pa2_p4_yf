package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;
@Controller
@RequestMapping("materias")
public class MateriaController {
 
	@Autowired
	private IMateriaService materiaService;
	
	
	@PostMapping("/crearMateria")
	public String crearMateria(Materia materia){
		this.materiaService.ingresar(materia);
		
		return "redirect:/materias/mostrarMaterias";
	}
	
	@GetMapping("/nuevaMateria")
	public String nuevaMateria(Materia materia) {
		
		return "vistaNuevaMateria";
	}
	
	@GetMapping("/mostrarMaterias")
	public String mostrarMateria(Model modelo) {
		List<Materia> lista=this.materiaService.mostrarTodo();
	    modelo.addAttribute("materia", lista);
		return "vistaMostrarMateria";
	}
	
	
    @GetMapping("/buscarPorID/{id}")
    public String buscarPorId(@PathVariable("id")Integer id, Model modelo) {
    	Materia mate=this.materiaService.buscarID(id);
    	modelo.addAttribute("materia",mate);
    	return "vistaActualizar";
    }
	
	@PostMapping("/actualizar/{id}")
	public String actualizarMateria(@PathVariable("id") Integer id, Materia materia) {
		this.materiaService.actualizar(materia);
		return " ";
	}

}
