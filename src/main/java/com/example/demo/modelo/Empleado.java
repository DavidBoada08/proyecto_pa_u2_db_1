package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_seq")
	@SequenceGenerator(name = "empl_seq", sequenceName = "empl_seq", allocationSize = 1)
	@Column(name = "empl_id")
	private Integer id;

	@Column(name = "empl_salario")
	private BigDecimal salario;

	@Column(name = "empl_fecha_ingreso")
	private LocalDateTime fechaIngreso;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empl_id_ciudadano")
	private Ciudadano ciudadano;

	// TO STRING
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso + "]";
	}

	// GETTER & SETTER

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

}
