package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHoteRepo;
import com.example.demo.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHoteRepo hoteRepo;

	@Override
	public void agregar(Hotel hotel) {
		this.hoteRepo.insertar(hotel);
		
	}

	@Override
	public void modificar(Hotel hotel) {
		this.hoteRepo.actualizar(hotel);
		
	}

	@Override
	public Hotel encontrar(Integer id) {
		
		return this.hoteRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.hoteRepo.eliminar(id);
		
	}
	

}
