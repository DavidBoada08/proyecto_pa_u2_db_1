package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface IHotelService {
	
	public void agregar(Hotel hotel);
	public void modificar(Hotel hotel);
	public Hotel encontrar(Integer id);
	public void borrar(Integer id);


}
