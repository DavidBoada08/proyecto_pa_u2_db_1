package com.example.demo.repository;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionRepo {
	
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void eliminar(Integer id);


}
