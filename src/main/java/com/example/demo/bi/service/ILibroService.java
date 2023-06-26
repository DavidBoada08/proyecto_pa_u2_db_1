package com.example.demo.bi.service;

import com.example.demo.bi.repo.modelo.Libro;

public interface ILibroService {

	public void crear(Libro libro);

	public void modificar(Libro libro);

	public Libro encontrar(Integer id);

	public void borrar(Integer id);

}
