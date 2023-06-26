package com.example.demo.bi.repo;

import com.example.demo.bi.repo.modelo.Libro;

public interface ILibroRepo {

	public void insertar(Libro libro);

	public void actualizar(Libro libro);

	public Libro buscar(Integer id);

	public void eliminar(Integer id);

}
