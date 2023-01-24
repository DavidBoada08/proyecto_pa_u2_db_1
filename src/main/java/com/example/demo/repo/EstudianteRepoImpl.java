package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.manager.persist(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.manager.merge(estudiante);

	}

	@Override
	public Estudiante buscar(Integer id) {

		return this.manager.find(Estudiante.class, id);

	}

	@Override
	public void eliminar(Integer id) {
		this.manager.remove(this.buscar(id));

	}

}
