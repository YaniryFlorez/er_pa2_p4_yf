package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaTemp;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

public interface IMatriculaService {

	public void ingresar(Matricula matricula);
	
	public void ingresarMatricula(MatriculaTemp matriculaTemp);
	
	public List<MatriculaDTO> mostrarMatriculas();
	
}
