package com.example.demo.matriculacion.repo;

import com.example.demo.matriculacion.modelo.Matriculacion;
import com.example.demo.matriculacion.modelo.Propietario;

public interface IMatriculacionRepo {
	
	public void insertar(Matriculacion maticula);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
	
	
	

}
