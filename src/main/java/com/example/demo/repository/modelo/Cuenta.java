package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "ctaBancaria")
@Entity
public class Cuenta {

	@GeneratedValue(generator = "seq_cta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cta", sequenceName = "seq_cta", allocationSize = 1)

	@Id
	@Column(name = "cta_id")
	private Integer id;

	@Column(name = "cta_num")
	private String numero;

	@Column(name = "cta_tipo")
	private String tipo;

	@Column(name = "cta_apertura")
	private LocalDate eapertura;

	@Column(name = "cta_saldo")
	private BigDecimal saldo;

	@Column(name = "cta_cedulaP")
	private String cedulaPropietario;

	// get set
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getEapertura() {
		return eapertura;
	}

	public void setEapertura(LocalDate eapertura) {
		this.eapertura = eapertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	@Override
	public String toString() {
		return "CtaBancaria [numero=" + numero + ", tipo=" + tipo + ", eapertura=" + eapertura + ", saldo=" + saldo
				+ ", cedulaPropietario=" + cedulaPropietario + "]";
	}

}
