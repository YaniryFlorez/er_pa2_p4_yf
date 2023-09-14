package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {

	public void ingresar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public Materia buscarID(Integer id);
	
	public Materia buscarPorCodigo(String codigo);
	
	public List<Materia> mostrarTodo();
	
	
}
