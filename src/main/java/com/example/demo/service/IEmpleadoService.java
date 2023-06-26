package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoService {
	
	public void agregar(Empleado empleado);
	public void modificar(Empleado empleado);
	public Empleado encontrar(Integer id);
	public void borrar(Integer id);

}
