package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICiudadanoRepo;
import com.example.demo.repository.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {
	
	@Autowired
	private ICiudadanoRepo ciudadanoRepo;

	@Override
	public void agregar(Ciudadano ciudadano) {
		this.ciudadanoRepo.insertar(ciudadano);
		
	}

	@Override
	public void modificar(Ciudadano ciudadano) {
		this.ciudadanoRepo.actulizar(ciudadano);
		
	}

	@Override
	public Ciudadano encontrar(Integer id) {
		
		return this.ciudadanoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.ciudadanoRepo.eliminar(id);
		
	}

}
