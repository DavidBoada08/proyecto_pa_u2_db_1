package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CiudadadoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.manager.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.manager.merge(ciudadano);

	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.manager.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.manager.remove(this.buscar(id));
	}

}
