package com.example.demo.matriculacion.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {
	
	private List<Propietario> baseDatos =  new ArrayList<>();
	

	@Override
	public void insertar(Propietario p) {
		baseDatos.add(p);
		
		
	}

	@Override
	public Propietario buscar(String cedula) {
		Propietario propietarioEncontrado = new Propietario();
		for (Propietario propietario : baseDatos ) {
			if(cedula.equals(propietario.getCedula())) {
				propietarioEncontrado = propietario;
			}
		}
		return propietarioEncontrado;
	}

	@Override
	public void actualizar(Propietario p) {
		this.eliminar(p.getCedula());
		this.actualizar(p);
		
	}

	@Override
	public void eliminar(String cedula) {
		Propietario propietario = this.buscar(cedula);
		baseDatos.remove(propietario);
		
		
	}

}
