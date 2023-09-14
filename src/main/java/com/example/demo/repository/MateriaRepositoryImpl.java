package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	//@Transactional(value = TxType.MANDATORY)
	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);		
	}

	//@Transactional(value = TxType.MANDATORY)
	@Override
	public void actualizar(Materia materia) {
		this.entityManager.merge(materia);

	}

	//@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}

	//@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public Materia buscarPorCodigo(String codigo) {
		TypedQuery<Materia> buscarCodigo=this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo=: datoCodigo", Materia.class);
		buscarCodigo.setParameter("datoCodigo",codigo);
		try {
			return buscarCodigo.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	
	}

	//@Transactional(value = TxType.NOT_SUPPORTED)
	@Override
	public List<Materia> buscarTodo() {
		TypedQuery<Materia> buscarTodo=this.entityManager.createQuery("SELECT m FROM Materia m",Materia.class);
		return buscarTodo.getResultList();
	}

}
