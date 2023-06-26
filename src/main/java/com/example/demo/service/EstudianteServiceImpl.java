package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void insertar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		return this.estudianteRepo.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		this.estudianteRepo.eliminar(cedula);
		
	}

	@Override
	public void modificar(Estudiante estudiante) {
	this.estudianteRepo.actualizar(estudiante);

	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante selecionarPorApellidoYNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.selecionarPorApellidoYNombre(apellido, nombre);
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante encontrarPorFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorFecha(fecha);
	}

	@Override
	public Estudiante encontrarFechaMayor(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarFechaMayor(fecha);
	}

	@Override
	public Estudiante encontrarFechaMenor(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarFechaMenor(fecha);
	}

	@Override
	public List<Estudiante> encontrarRangoFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarRangoFecha(fecha);
	}
}
