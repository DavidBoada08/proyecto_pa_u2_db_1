package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Table(name="empleado")
@Entity
public class Empleado {
	
	@Id
	@SequenceGenerator(name = "seq_empleado",sequenceName = "seq_empleado",allocationSize = 1)//AllocantionSize tiene que ver con el valor de incremento que se puso en la base de datos
	@GeneratedValue(generator = "seq_empleado",strategy = GenerationType.SEQUENCE)
	@Column(name= "empl_id")
	private Integer id;
	
	@Column(name= "empl_sueldo")
	private BigDecimal sueldo;
	
	@Column(name = "empl_cargo")
	private String cargo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="empl_id_ciud")//
	private Ciudadano ciudadano;

	
	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", sueldo=" + sueldo + ", cargo=" + cargo + ", ciudadano=" + ciudadano + "]";
	}
	
	
	

}
