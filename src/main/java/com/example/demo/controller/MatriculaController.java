package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaTemp;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService matriculaService;
	
	@PostMapping("/crearMatricula")
	public String crearMatricula(MatriculaTemp matriculaTemp, Model modelo) {
		this.matriculaService.ingresarMatricula(matriculaTemp);
		MatriculaTemp mat= new MatriculaTemp();	
		modelo.addAttribute("matriculaTemp", mat);
		
		return "redirect:/matriculas/mostrarMatriculas";
	}
	
	@GetMapping("/nuevaMatricula")
	public String nuevaMatricula(MatriculaTemp matriculaTemp) {
		
		return "vistaNuevaMatricula";	
	}
	
	@GetMapping("/mostrarMatriculas")
	public String mostrarMatriculas(Model modelo) {
		List<MatriculaDTO> lista=this.matriculaService.mostrarMatriculas();
	    modelo.addAttribute("matriculas", lista);
	    
		return "vistaMatriculas";
	}
}
