package com.example.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDate fechaDeNaciemiento;
	
	
	public String getNumero() {
		return nombre;
	}
	public void setNumero(String numero) {
		this.nombre = numero;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDate getFechaDeNaciemiento() {
		return fechaDeNaciemiento;
	}
	public void setFechaDeNaciemiento(LocalDate fechaDeNaciemiento) {
		this.fechaDeNaciemiento = fechaDeNaciemiento;
	}
	@Override
	public String toString() {
		return "Propietario [numero=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaDeNaciemiento=" + fechaDeNaciemiento + "]";
	}

}
