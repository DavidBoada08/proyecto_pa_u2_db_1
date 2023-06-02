package com.example.demo.matriculacion.repo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculacion.modelo.Matriculacion;
import com.example.demo.matriculacion.modelo.Propietario;
@Repository
public class MatriculacionRepoImpl implements IMatriculacionRepo{
	
	private List<Matriculacion> baseDatos =  new ArrayList<>();

	@Override
	public void insertar(Matriculacion maticula) {
		baseDatos.add(maticula);
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
