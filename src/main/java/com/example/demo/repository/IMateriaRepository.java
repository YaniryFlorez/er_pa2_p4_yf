package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public Materia buscarID(Integer id);
	
	public Materia buscarPorCodigo(String codigo);
	
	public List<Materia> buscarTodo();
	
	
}
