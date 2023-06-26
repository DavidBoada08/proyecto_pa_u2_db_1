package com.example.demo.repository;

import com.example.demo.repository.modelo.Cuenta;

public interface CtaBancariaRepo  {
	
	public void insertar(Cuenta ctaBancaria);
	public void actualizar(Cuenta ctaBancaria);
	public Cuenta buscar(Integer id);
	public void eliminar(Integer id);

}
