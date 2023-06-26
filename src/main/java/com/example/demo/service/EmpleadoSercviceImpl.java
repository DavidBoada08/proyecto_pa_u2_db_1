package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEmpleadoRepo;
import com.example.demo.repository.modelo.Empleado;

@Service
public class EmpleadoSercviceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo empleadoRepo;

	@Override
	public void agregar(Empleado empleado) {
		this.empleadoRepo.insertar(empleado);

	}

	@Override
	public void modificar(Empleado empleado) {
		this.empleadoRepo.actulizar(empleado);

	}

	@Override
	public Empleado encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.empleadoRepo.eliminar(id);

	}

}
