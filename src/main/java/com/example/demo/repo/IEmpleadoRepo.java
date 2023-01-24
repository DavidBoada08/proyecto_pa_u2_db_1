package com.example.demo.repo;

import com.example.demo.modelo.Empleado;

public interface IEmpleadoRepo {

	public void insertar(Empleado empleado);

	public void actualizar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void eliminar(Integer id);

}
