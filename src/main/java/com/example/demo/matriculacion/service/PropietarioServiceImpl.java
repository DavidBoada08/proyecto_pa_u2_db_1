package com.example.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.repo.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	
	
	@Autowired
	private IPropietarioRepo propietarioRepo;

	
	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.actualizar(propietario);
		
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.eliminar(cedula);
		
	}

	@Override
	public void crearPropietario(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepo.insertar(propietario);
	}



}
