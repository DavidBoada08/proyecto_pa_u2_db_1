package com.example.demo.bi.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.bi.repo.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepoImple implements IAutorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autor autor) {
		this.entityManager.persist(autor);

	}

	@Override
	public void actualizar(Autor autor) {
		this.entityManager.merge(autor);

	}

	@Override
	public Autor buscar(Integer id) {

		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);

	}

}
