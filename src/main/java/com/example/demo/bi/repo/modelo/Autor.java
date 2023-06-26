package com.example.demo.bi.repo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name= "autor")
@Entity
public class Autor {
	
	
	@Id
	@GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)
	// nombre generador secuencia nombre incremento
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@Column(name="aut_id")
	private Integer id;
	
	@Column(name="aut_nom")
	private String nombre;
	
	@Column(name="aut_ape")
	private String apellido;
	
	//necesario Set para generar listas o varias tablas de rompimiento en
	//ManyToMany
	//el cascade = CascadeType.ALL es cuando se desea que sea el padre
	//de onde se generan tablas de rompimiento
	@ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL)
	//@ManyToMany(mappedBy = "autores")
	private Set <Libro> libros;
	
	//set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libros=" + libros + "]";
	}
	
	
	
	
	
	
	
	

}
