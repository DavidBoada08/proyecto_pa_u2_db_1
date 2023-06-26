package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;


public interface IHoteRepo {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void eliminar(Integer id);


}
