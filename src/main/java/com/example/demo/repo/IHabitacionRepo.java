package com.example.demo.repo;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionRepo {
	

	public void insertar(Habitacion habitacion );

	public void actualizar(Habitacion habitacion);

	public Habitacion buscar(Integer id);

	public void eliminar(Integer id);

}
