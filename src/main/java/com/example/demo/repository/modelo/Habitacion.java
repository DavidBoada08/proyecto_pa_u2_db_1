package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "habitacion")
@Entity
public class Habitacion {
	

	@Id
	@SequenceGenerator(name = "seq_habitacion",sequenceName = "seq_habitacion",allocationSize = 1)
	@GeneratedValue(generator = "seq_habitacion",strategy = GenerationType.SEQUENCE)
	
	@Column(name="hab_id")
	private Integer id;
	
	@Column(name = "hab_numero")
	private String numero;  //solo cuando realizo operaciones uso el numero como Integer
	
	@Column(name = "hab_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name ="habitacion_id_hotel")
	private Hotel hotel;

	
	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", valor=" + valor + ", hotel=" + hotel + "]";
	}
	
	
	
	
	

}
