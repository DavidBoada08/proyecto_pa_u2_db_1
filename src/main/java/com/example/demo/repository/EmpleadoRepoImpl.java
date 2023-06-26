package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actulizar(Empleado empleado) {
		this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}

}
