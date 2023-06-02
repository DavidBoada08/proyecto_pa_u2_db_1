package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {

	public void insertar(Vehiculo vehiculo);

	public Vehiculo buscarVehiculo(String placa);

	public void actualizarVhiculo(Vehiculo v);

	public void eliminarVehiculo(String placas);

	
}
