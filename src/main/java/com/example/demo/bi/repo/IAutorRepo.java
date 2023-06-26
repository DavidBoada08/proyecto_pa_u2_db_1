package com.example.demo.bi.repo;

import com.example.demo.bi.repo.modelo.Autor;

public interface IAutorRepo {

	public void insertar(Autor autor);

	public void actualizar(Autor autor);

	public Autor buscar(Integer id);

	public void eliminar(Integer id);

}
