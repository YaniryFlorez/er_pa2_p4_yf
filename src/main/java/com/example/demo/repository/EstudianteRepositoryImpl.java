package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{
	@PersistenceContext
	private EntityManager entityManager;
	

	@Transactional(value = TxType.MANDATORY)
	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}
	
	@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Estudiante buscarPorCedula(String cedula) {
		TypedQuery<Estudiante> buscarCedula=this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula", Estudiante.class);
		buscarCedula.setParameter("datoCedula",cedula);
		try {
			return buscarCedula.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}
}

