package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repo.IHotelRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
		
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizar(hotel);
		
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
			return this.hotelRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.eliminar(id);
		
	}

}
