package com.example.demo.service;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	
	// CRUD BASICO SIEMPRE POR PK
		public void crear(Hotel hotel);

		public void actualizar(Hotel hotel);

		public Hotel buscar(Integer id);

		public void eliminar(Integer id);

}
