package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

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
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Hotel hotel = this.hotelService.buscar(1);
		
		System.out.println("HOTEL : "+hotel.getNombre());
		
		System.out.println("Habtiaciones: "+hotel.getHabitaciones());
		
		
		
	
		
	
		
		
		
		
		
	}

}
