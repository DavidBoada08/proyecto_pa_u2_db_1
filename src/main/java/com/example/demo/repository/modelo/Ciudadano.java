package com.example.demo.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "ciudadano")
@Entity
public class Ciudadano {
	
	@Id
	@SequenceGenerator(name = "seq_ciudadano",sequenceName = "seq_ciudadano",allocationSize = 1)//AllocantionSize tiene que ver con el valor de incremento que se puso en la base de datos
	@GeneratedValue(generator = "seq_ciudadano",strategy = GenerationType.SEQUENCE)
	@Column(name= "ciu_id")
	private Integer id;
	
	@Column(name= "ciu_cedula")
	private String cedula;
	
	@Column(name= "ciu_nombre")
	private String nombre;
	
	@Column(name= "ciu_apellido")
	private String apellido;
	
	//en la tabla principal en la columna que hace la referencia de la relacion uno a uno se colaca la anotacion @OneToOne
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL) 
	
	private Empleado empleado;

	
	//set y get
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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	

}
