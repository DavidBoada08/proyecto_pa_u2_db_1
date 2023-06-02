package com.example.demo.matriculacion.service;

import com.example.demo.matriculacion.modelo.Matriculacion;

public interface IMatriculacionSevice {
	
	public void realizarMatricula(String cedula, String placa);
	public void insertaMatricula(Matriculacion matriculacio );
	

}
