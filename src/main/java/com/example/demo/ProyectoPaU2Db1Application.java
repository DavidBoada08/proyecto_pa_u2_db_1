package com.example.demo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.bi.repo.modelo.Autor;
import com.example.demo.bi.repo.modelo.Libro;
import com.example.demo.bi.service.AutorServiceImpl;
import com.example.demo.bi.service.LibroServiceImpl;
import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CtaBancariaService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.EstudianteServiceImpl;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2Db1Application implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Db1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estu = new Estudiante();

		estu.setApellido("Aguacondo");
		estu.setCedula("1720030723");
		estu.setFechaNaciemiento(LocalDate.of(1991, 12, 07));
		estu.setNombre("Fernando");

		// this.estudianteService.insertar(estu);

		// System.out.println(estu);

		this.estudianteService.encontrarPorFecha(LocalDate.of(1991, 5, 7));

		// this.estudianteService.encontrarFechaMayor(LocalDate.of(1991, 5, 7));

		// this.estudianteService.encontrarFechaMenor(LocalDate.of(1991, 5, 7));

	}

}
