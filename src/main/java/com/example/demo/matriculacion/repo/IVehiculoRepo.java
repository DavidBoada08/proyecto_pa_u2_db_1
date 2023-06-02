package com.example.demo.matriculacion.repo;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo v);
	public Vehiculo buscar(String placa);
	public void actualizar (Vehiculo v);
	public void eliminar (String placa);
	
	

}
