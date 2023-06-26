package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "estudiante")
@Entity
public class Estudiante {

	// PRIMARY KEY ID(hace relacion con la base de datos )
	// siempre al inicio
	// mapeo especifico dentro de mi primaryKeys
// generador no debe ser seteado
	@GeneratedValue(generator = "seq_estudiante", strategy = GenerationType.SEQUENCE)
	// nombre generador secuencia nombre incremento
	@SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)

	@Id
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	@Column(name = "estu_nacimiento")
	private LocalDate fechaNaciemiento;

	
	// get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNaciemiento() {
		return fechaNaciemiento;
	}

	public void setFechaNaciemiento(LocalDate fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNaciemiento=" + fechaNaciemiento + "]";
	}


	

	

}