package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2Db1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Db1Application.class, args);
	}
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		Ciudadano ciu = new  Ciudadano();
		ciu.setNombre("David");
		ciu.setApellido("Boada");
		//this.ciudadanoService.ingresar(ciu);
		
		Empleado empl = new Empleado();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciu);
		this.empleadoService.ingresar(empl);
		
		Ciudadano ciu2 = new  Ciudadano();
		ciu2.setNombre("Marlon");
		ciu2.setApellido("Boada");
		this.ciudadanoService.ingresar(ciu2);
		
		
		Empleado empl2 = new Empleado();
		empl2.setSalario(new BigDecimal(50));
		empl2.setFechaIngreso(LocalDateTime.now());
		this.empleadoService.ingresar(empl2);
		
		
	}

}
