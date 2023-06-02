package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.modelo.Matriculacion;
import com.example.demo.matriculacion.modelo.Propietario;
import com.example.demo.matriculacion.modelo.Vehiculo;
import com.example.demo.matriculacion.service.IMatriculacionSevice;
import com.example.demo.matriculacion.service.IPropietarioService;
import com.example.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2Db1Application implements CommandLineRunner {

	@Autowired
	private IMatriculacionSevice iMatriculaService;

	@Autowired
	private IPropietarioService iPropietarioService;

	@Autowired
	private IVehiculoService iVehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Db1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		//1. Crear un vehículo.
		
				Vehiculo vehi = new Vehiculo();
				
				vehi.setMarca("Mazda");
				vehi.setPlaca("pcd2588");
				vehi.setPrecio(new BigDecimal(2000));
				vehi.setTipo("Liviano");
				this.iVehiculoService.insertar(vehi);				
				
				//2. Actualizar dos atributos del vehículo creado en el punto 1.
				vehi.setMarca("AUDI");
				vehi.setPrecio(new BigDecimal(3000));
				this.iVehiculoService.actualizarVhiculo(vehi);
				
				//3. Crear un propietario.
				
				Propietario propi = new Propietario();
				propi.setApellido("Boada");
				propi.setNumero("David");
				propi.setCedula("1720030723");
				propi.setFechaDeNaciemiento(LocalDate.of(1991, 5, 7));
				this.iPropietarioService.crearPropietario(propi);
				
		
				//4. Realizar una matrícula de vehículo a partir de los datos: cedula y placa del vehículo utilizados
				//en los puntos 1 y 3.
				
				
				this.iMatriculaService.realizarMatricula(vehi.getPlaca(), propi.getCedula());
				
				
				
				
		// TODO Auto-generated method stub
		
	}

}
