package com.example.demo.matriculacion.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.modelo.Matriculacion;
import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.repo.IMatriculacionRepo;
import com.example.demo.matriculacion.repo.IPropietarioRepo;
import com.example.demo.matriculacion.repo.IVehiculoRepo;

@Service

public class MatriculacionServiceImpl implements IMatriculacionSevice {



	@Autowired
	private IMatriculacionRepo iMatriculacionRepo;
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	

	@Autowired 
	private IPropietarioService iPropietarioService;
	
	

	@Override
	public void realizarMatricula(String cedula, String placa) {
		Matriculacion matricu = new Matriculacion();
		matricu.setFechaMatricula(LocalDateTime.now());

		Propietario propietario = this.iPropietarioRepo.buscar(cedula);
		matricu.setPropietario(propietario);
		
		Vehiculo vehiculo =this.iVehiculoRepo.buscar(placa);
				
		matricu.setVehiculo(vehiculo);
		
		BigDecimal valor =null;
		//Para el tipo de matricula
		if(vehiculo.getTipo().equalsIgnoreCase("Liviano")) {
			
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.15)).setScale(2,RoundingMode.HALF_UP);
			//BigDecimal resultado= valor.setScale(2,RoundingMode.HALF_UP);
            System.out.println("Valor a pagar de vehiculo Pesado " +valor);
		}else {
			valor= vehiculo.getPrecio().multiply(new BigDecimal(0.10)).setScale(3,RoundingMode.HALF_UP);
			System.out.println("Valor a pagar vehiculo Liviano " + valor  );
		}
		//En cualquiera de los dos tipos de vehículos, si el “Valor de matrícula” supera los $2000 (dos mil dólares)
		//se debe aplicar al “Valor de matrícula” un descuento del 7%.
		if(valor.compareTo(new BigDecimal(2000))>1) {
			BigDecimal descuento= valor.multiply(new BigDecimal(0.07));
			valor = valor.subtract(descuento);
			
		}
		matricu.setValorMatricula(valor);
		this.iMatriculacionRepo.insertar(matricu);
	 
	}

	



	@Override
	public void insertaMatricula(Matriculacion matriculacio) {
		// TODO Auto-generated method stub
		
	}

}
