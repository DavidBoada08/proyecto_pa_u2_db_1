package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Cuenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CtaBancariaRepoImpl implements CtaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cuenta ctaBancaria) {
		this.entityManager.persist(ctaBancaria);
		
	}

	@Override
	public void actualizar(Cuenta ctaBancaria) {
		this.entityManager.merge(ctaBancaria);
		
	}

	@Override
	public Cuenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
	}

	
}
