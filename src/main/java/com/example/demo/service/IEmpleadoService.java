package com.example.demo.service;

import com.example.demo.modelo.Empleado;

public interface IEmpleadoService {
	public void ingresar(Empleado empleado);

	public void modificar(Empleado empleado);

	public Empleado encontrar(Integer id);

	public void remover(Integer id);

}
