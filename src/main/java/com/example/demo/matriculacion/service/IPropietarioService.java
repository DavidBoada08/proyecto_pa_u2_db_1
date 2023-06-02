package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {
	
	public void  crearPropietario(Propietario propietario);

	public Propietario buscarPropietario(String cedula);
	
	public void actualizar(Propietario propietario);
	
	public void eliminarPropietario(String cedula);


}
