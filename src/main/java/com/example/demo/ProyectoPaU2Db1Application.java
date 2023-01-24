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

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// CREACION DE HOTEL
		Hotel hotel = new Hotel();
		
		hotel.setDireccion("San Diego");
		hotel.setNombre("El Mirados de San Diego");
		
		
		//CREACION DE HABITACIONES
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setNumero("01");
		habitacion1.setHotel(hotel);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("02");
		habitacion2.setHotel(hotel);
		
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setNumero("03");
		habitacion3.setHotel(hotel);
		
		Habitacion habitacion4 = new Habitacion();
		habitacion4.setNumero("04");
		habitacion4.setHotel(hotel);
		
		List<Habitacion> lista = new ArrayList<>();
		
		lista.add(habitacion1);
		lista.add(habitacion2);
		lista.add(habitacion3);
		lista.add(habitacion4);
		
		hotel.setHabitaciones(lista);
		
		//this.hotelService.crear(hotel);
		
		
		//actualizacion de hotel Y HABITACION NUEVA
		hotel.setNombre("El Mirador");
		
		Habitacion habitacion5 = new Habitacion();
		habitacion5.setNumero("05");
		habitacion5.setHotel(hotel);
		lista.add(habitacion5);
		
		
		//this.hotelService.actualizar(hotel);
		
		//ELIMINACION DE HOTEL
		this.hotelService.eliminar(3);
		
		
		
		
		
	}

}
