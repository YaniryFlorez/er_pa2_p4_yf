package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository materiaRepository;
	
	//@Transactional(value = TxType.MANDATORY)
	@Override
	public void ingresar(Materia materia) {
		this.materiaRepository.insertar(materia);		
	}

	@Transactional(value = TxType.MANDATORY)
	@Override
	public void actualizar(Materia materia) {
		this.materiaRepository.actualizar(materia);
		
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarID(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscarID(id);
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscarPorCodigo(codigo);
	}

	//@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public List<Materia> mostrarTodo() {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscarTodo();
	}

}
