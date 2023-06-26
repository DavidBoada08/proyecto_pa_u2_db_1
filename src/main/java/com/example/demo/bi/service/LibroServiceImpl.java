package com.example.demo.bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bi.repo.ILibroRepo;
import com.example.demo.bi.repo.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepo iLibroRepo;

	@Override
	public void crear(Libro libro) {
		this.iLibroRepo.insertar(libro);

	}

	@Override
	public void modificar(Libro libro) {
		this.iLibroRepo.actualizar(libro);

	}

	@Override
	public Libro encontrar(Integer id) {

		return this.iLibroRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iLibroRepo.eliminar(id);

	}

}
