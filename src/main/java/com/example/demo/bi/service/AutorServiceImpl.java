package com.example.demo.bi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bi.repo.IAutorRepo;
import com.example.demo.bi.repo.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {
	
	@Autowired
	private IAutorRepo  iautorRepo;

	@Override
	public void crear(Autor autor) {
		this.iautorRepo.insertar(autor);
		
	}

	@Override
	public void modificar(Autor autor) {
		this.iautorRepo.actualizar(autor);
		
	}

	@Override
	public Autor encontrar(Integer id) {
		
		return this.iautorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iautorRepo.eliminar(id);
		
	}

	
	

}
