package com.example.demo.matriculacion.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Vehiculo;


@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {
	
	private List<Vehiculo> baseDatos = new ArrayList<>(); 

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		baseDatos.add(v);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		
		Vehiculo vehiculoEncontrado = new Vehiculo();
		for (Vehiculo vehi: baseDatos) {
			if(placa.equals(vehi.getPlaca())) {
				vehiculoEncontrado = vehi;
			break;
			}
		}
	
		return vehiculoEncontrado;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		
		this.eliminar(v.getPlaca());
		this.insertar(v);
		
		
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
		baseDatos.remove(this.buscar(placa));
		
		
	}
	
	



}
