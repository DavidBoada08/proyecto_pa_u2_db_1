package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface IHabitacionService {

	public void agregar(Habitacion habitacion);
	public void modificar(Habitacion habitacion	);
	public Habitacion encontrar(Integer id);
	public void borrar(Integer id);

}
