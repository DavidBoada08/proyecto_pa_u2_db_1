package com.example.demo.service;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionService {
	
	// CRUD BASICO SIEMPRE POR PK
	public void crear(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public Habitacion buscar(Integer id);

	public void borrar(Integer id);

}
