package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository

//necesita la siguiente anotacion para la conexion con la baseDatos
@Transactional
public class EstudianteRepoImpl implements EstudianteRepo {
	// public static List<Estudiante> baseDatos = new ArrayList<>();

	// permite la interaccion con la base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);

	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu= this.buscar(cedula);
		this.entityManager.remove(estu);

	}

	// Query
		@Override
		public Estudiante seleccionarPorApellido(String apellido) {
			// TODO Auto-generated method stub
			// SQL= select * from estudiante where estu_apellido= ""
			// JPQL= select e from Estudiante e where e.apellido = "e"
			Query myQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
			myQuery.setParameter("datoApellido", apellido);
			return (Estudiante) myQuery.getSingleResult();
		}

		@Override
		public List<Estudiante> seleccionarListaPorApellido(String apellido) {
			// TODO Auto-generated method stub
			Query myQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
			myQuery.setParameter("datoApellido", apellido);
			return myQuery.getResultList();
		}

		@Override
		public Estudiante selecionarPorApellidoYNombre(String apellido, String nombre) {
			// TODO Auto-generated method stub
			Query myQuery = this.entityManager
					.createQuery("select e from Estudiante e where e.apellido = :datoApellido and e.nombre=:datoNombre");
			myQuery.setParameter("datoApellido", apellido);
			myQuery.setParameter("datoNombre", nombre);
			return (Estudiante) myQuery.getSingleResult();
		}

		// TYPED
		@Override
		public Estudiante seleccionarPorApellidoTyped(String apellido) {
			// TODO Auto-generated method stub
			TypedQuery<Estudiante> myTypedQuery = this.entityManager.createQuery(
					"select e from Estudiante e where e.apellido = :datoApellido",
					Estudiante.class);
			myTypedQuery.setParameter("datoApellido", apellido);
			return myTypedQuery.getSingleResult();
		}

		@Override
		public Estudiante buscar(String cedula) {
			
			return this.entityManager.find(Estudiante.class, cedula);
		}

		@Override
		public Estudiante buscarPorFecha(LocalDate fechaNaciemiento) {
			Query myQuery = this.entityManager
					.createQuery("select e from Estudiante e where e.fechaNaciemiento = :datoFechaNacimiento");
			myQuery.setParameter("datoFechaNacimiento", fechaNaciemiento);
			
			return (Estudiante) myQuery.getSingleResult();
		}

		@Override
		public Estudiante buscarFechaMayor(LocalDate fechaNaciemiento) {
			Query myQuery = this.entityManager
					.createQuery("select e from Estudiante e where e.fechaNaciemiento > :datoFechaNaciemiento");
			myQuery.setParameter(":datoFechaNaciemiento", fechaNaciemiento);
			
			return (Estudiante) myQuery.getSingleResult();
		}

		@Override
		public Estudiante buscarFechaMenor(LocalDate fechaNaciemiento) {
			Query myQuery = this.entityManager
					.createQuery("select e from Estudiante e where e.fechaNaciemiento < :datoFechaNacimiento");
			myQuery.setParameter(":datoFechaNacimiento", fechaNaciemiento);
			
			return (Estudiante) myQuery.getSingleResult();
		}

		@Override
		public List<Estudiante> buscarRangoFecha(LocalDate fechaNaciemiento) {
			Query myQuery = this.entityManager.createQuery("select e from Estudiante e where e.fechaNaciemiento >= '1995-10-31' AND e.fechaNaciemiento <= '1995-12-31'");
			myQuery.setParameter("datoApellido", fechaNaciemiento);
			return myQuery.getResultList();
		}
		
	

}
