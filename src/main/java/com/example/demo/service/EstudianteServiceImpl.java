package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Transactional(value = TxType.REQUIRED)
	@Override
	public void ingresar(Estudiante estudiante) {
		this.estudianteRepository.insertar(estudiante);
		
	}

	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorCedula(cedula);
	}

}
