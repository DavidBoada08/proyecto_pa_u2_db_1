package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscar (String cedula);
	public void eliminar(String cedula);
	public void actualizar(Estudiante estudiante);
	
	
	//QUERY
		public Estudiante seleccionarPorApellido(String apellido);
		public List<Estudiante> seleccionarListaPorApellido(String apellido);
		public Estudiante selecionarPorApellidoYNombre(String apellido, String nombre);
		//TYPED QUERY
		public Estudiante seleccionarPorApellidoTyped(String apellido);
		
	//QUERY DEBER
		public Estudiante buscarPorFecha (LocalDate fecha);
		public Estudiante buscarFechaMayor (LocalDate fecha);
		public Estudiante buscarFechaMenor (LocalDate fecha);
		public List<Estudiante> buscarRangoFecha (LocalDate fecha);
		


	
}
