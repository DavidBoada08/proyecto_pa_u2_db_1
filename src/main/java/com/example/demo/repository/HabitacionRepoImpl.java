package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.entityManager.merge(habitacion);
		
	}

	@Override
	public Habitacion buscar(Integer id) {
		
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}
	
	

}
