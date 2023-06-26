package com.example.demo.bi.service;

import com.example.demo.bi.repo.modelo.Autor;

public interface IAutorService {
	
	public void crear(Autor autor);

	public void modificar(Autor autor);

	public Autor encontrar(Integer id);

	public void borrar(Integer id);

}
