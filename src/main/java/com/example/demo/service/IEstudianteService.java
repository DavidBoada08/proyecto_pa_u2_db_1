package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	// CRUD BASICO SIEMPRE POR PK
	public void crear(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscar(Integer id);

	public void eliminar(Integer id);
	

}
