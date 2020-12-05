package edu.epidata.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Capitulo {
	@Id // Indica que es el identificador de las personas
	private int id;
	@Column
	private String titulo;
	@Column
	private int paginas;
//Un capítulo tiene un solo revisor
//Un revisor puede corregir muchos capítulos
	@ManyToOne
	private Persona revisor;
//Un capítulo puede tener muchos autores
//Un autor puede haber escrito muchos capítulos.
	@ManyToMany
	private List<Persona> autores = new ArrayList<>();
//Un libro tiene muchos capítulos, pero un capitulo está en un solo libro
	@ManyToOne
	private Libro libro;

	public Capitulo() {
//Requerido
	}

	public Capitulo(int id, String titulo, int paginas, Persona revisor, List<Persona> autores, Libro libro) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
		this.revisor = revisor;
		this.autores = autores;
		this.libro = libro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Persona getRevisor() {
		return revisor;
	}

	public void setRevisor(Persona revisor) {
		this.revisor = revisor;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public List<Persona> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		return "Capitulo [id=" + id + ", titulo=" + titulo + ", paginas=" + paginas + ", revisor=" + revisor
				+ ", autores=" + autores + ", libro=" + libro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + id;
		result = prime * result + ((libro == null) ? 0 : libro.hashCode());
		result = prime * result + paginas;
		result = prime * result + ((revisor == null) ? 0 : revisor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Capitulo))
			return false;
		Capitulo other = (Capitulo) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (id != other.id)
			return false;
		if (libro == null) {
			if (other.libro != null)
				return false;
		} else if (!libro.equals(other.libro))
			return false;
		if (paginas != other.paginas)
			return false;
		if (revisor == null) {
			if (other.revisor != null)
				return false;
		} else if (!revisor.equals(other.revisor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}