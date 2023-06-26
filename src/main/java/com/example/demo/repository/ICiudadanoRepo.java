package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	public void insertar(Ciudadano ciudadano);
	public void actulizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void eliminar(Integer id);

}
