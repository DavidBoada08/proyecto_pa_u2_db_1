package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadadoRepoImpl  implements ICiudadanoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);
		
	}

	@Override
	public void actulizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id) {
		
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}
	
	

}
