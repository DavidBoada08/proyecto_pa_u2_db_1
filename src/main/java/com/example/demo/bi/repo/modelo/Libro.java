package com.example.demo.bi.repo.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "libro")
@Entity
public class Libro {

	@Id
	@GeneratedValue(generator = "seq_libro", strategy = GenerationType.SEQUENCE)
	// nombre generador secuencia nombre incremento
	@SequenceGenerator(name = "seq_libro", sequenceName = "seq_libro", allocationSize = 1)
	@Column(name = "lib_id")
	private Integer id;

	@Column(name = "lib_tit")
	private String titulo;

	@Column(name = "lib_edi")
	private String editorial;

	@ManyToMany
	// se empieza siempre con la relacion
	@JoinTable(name = "autor_libro", joinColumns = @JoinColumn(name = "auli_id_libro"), inverseJoinColumns = @JoinColumn(name = "auli_id_autor"))
	private Set<Autor> autores;

	// set get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", autores=" + autores + "]";
	}

}
