package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.DTO.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> mostrarMatriculas() {
		
		TypedQuery<MatriculaDTO> myTypedQuery = this.entityManager
				 .createQuery("select NEW com.example.demo.repository.modelo.DTO.MatriculaDTO(m.estudiante.cedula, m.estudiante.apellido, m.materia.nombre, m.materia.codigo, m.fechaMatricula) "
				 		+ "FROM Matricula m", MatriculaDTO.class);
		return myTypedQuery.getResultList();
	}

}
