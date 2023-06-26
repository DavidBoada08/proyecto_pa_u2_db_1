package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHabitacionRepo;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
	
	@Autowired
	private IHabitacionRepo habitacionRepo;

	@Override
	public void agregar(Habitacion habitacion) {
		this.habitacionRepo.insertar(habitacion);
		
	}

	@Override
	public void modificar(Habitacion habitacion) {
		this.habitacionRepo.actualizar(habitacion);
		
	}

	@Override
	public Habitacion encontrar(Integer id) {
		
		return this.habitacionRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.habitacionRepo.eliminar(id);
		
	}

	
	
	

}
