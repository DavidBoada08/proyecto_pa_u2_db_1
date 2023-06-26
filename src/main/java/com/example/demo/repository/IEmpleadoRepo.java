package com.example.demo.repository;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoRepo {
	
	public void insertar(Empleado empleado);
	public void actulizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void eliminar(Integer id);

}
