package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void insertar(Estudiante estudiante);

	public Estudiante seleccionar(String cedula);

	public void eliminar(String cedula);

	public void modificar(Estudiante estudiante);

	// QUERY
	public Estudiante seleccionarPorApellido(String apellido);

	public List<Estudiante> seleccionarListaPorApellido(String apellido);

	public Estudiante selecionarPorApellidoYNombre(String apellido, String nombre);

	// TYPED QUERY
	public Estudiante seleccionarPorApellidoTyped(String apellido);

	// QUERY DEBER
	public Estudiante encontrarPorFecha(LocalDate fecha);

	public Estudiante encontrarFechaMayor(LocalDate fecha);

	public Estudiante encontrarFechaMenor(LocalDate fecha);

	public List<Estudiante> encontrarRangoFecha(LocalDate fecha);

}
