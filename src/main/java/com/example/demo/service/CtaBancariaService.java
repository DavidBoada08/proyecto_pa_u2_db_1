package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.Cuenta;

public interface CtaBancariaService {
	
	
	public void apertura(Cuenta ctaBancaria);
	public void actualizar(Cuenta ctaBancaria);
	public Cuenta consultar(Integer id);
	public void eliminar(Integer id);
	
	public void calculo(Integer id,  BigDecimal saldo);


}
