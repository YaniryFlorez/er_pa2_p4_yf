package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.MatriculaTemp;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;


@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Transactional(value = TxType.REQUIRED)
	@Override
	public void ingresar(Matricula matricula) {
		 this.matriculaRepository.insertar(matricula);
		
	}

	@Transactional(value = TxType.REQUIRED)
	@Override
	public void ingresarMatricula(MatriculaTemp matriculaTemp) {
		
		Estudiante estu=this.estudianteRepository.buscarPorCedula(matriculaTemp.getCedula());
		Materia mate= this.materiaRepository.buscarPorCodigo(matriculaTemp.getCodigo());
		
		Matricula matri=new Matricula();
		matri.setEstudiante(estu);
		matri.setMateria(mate);
		matri.setFechaMatricula(LocalDate.now());
		mate.setNumeroEstudiantes(mate.getNumeroEstudiantes()+1);
		this.materiaRepository.actualizar(mate);
		
		this.matriculaRepository.insertar(matri);
		
		
	}

	@Transactional(value =TxType.NOT_SUPPORTED)
	@Override
	public List<MatriculaDTO> mostrarMatriculas() {
		
		return this.matriculaRepository.mostrarMatriculas();
	}

	
}
