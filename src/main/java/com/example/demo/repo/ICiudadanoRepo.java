package com.example.demo.repo;

import com.example.demo.modelo.Ciudadano;

public interface ICiudadanoRepo {

	public void insertar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void eliminar(Integer id);

}
