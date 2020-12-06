package edu.epidata.jpa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import edu.epidata.dto.ReportePersonaCantidadDTO;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		CargaDatos.cargar();
		Scanner scanner = new Scanner(System.in);
		int anio;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		TypedQuery<Persona> tpq1 = em.createQuery("SELECT p FROM Persona p", Persona.class);

		System.out.println("\nPersonas:\n");
		for (Persona persona : tpq1.getResultList()) {
			System.out.println(persona);
		}
		em.getTransaction().commit();

		em.getTransaction().begin();
		TypedQuery<ReportePersonaCantidadDTO> tpQuery = em.createQuery(
				"SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
						+ " FROM Libro l JOIN l.editores p" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);

		System.out.println("\nIngrese un año para saber la cantidad de libros que edito cada persona en ese anio: ");
		anio = scanner.nextInt();
		tpQuery.setParameter("anio", anio);

		List<ReportePersonaCantidadDTO> res = tpQuery.getResultList();

		System.out.println("\nCantidad de libros que edito cada persona en el anio " + anio + ":\n");
		res.forEach(r -> System.out.println(r));
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);

		System.out.println("\nIngrese un año para saber la cantidad de paginas que reviso cada persona en ese anio: ");
		anio = scanner.nextInt();
		tpQuery.setParameter("anio", anio);

		res = tpQuery.getResultList();

		System.out.println("\nCantidad de paginas que reviso cada persona en el anio " + anio + ":\n");
		res.forEach(r -> System.out.println(r));
		em.getTransaction().commit();

		em.getTransaction().begin();
		tpQuery = em.createQuery(
				"SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(distinct l.id))"
						+ " FROM Capitulo c JOIN c.autores p JOIN c.libro l " + " GROUP BY p.id",
				ReportePersonaCantidadDTO.class);

		res = tpQuery.getResultList();
		
		System.out.println("\nEn cuantos libros participo cada persona como autor de capitulo:\n");
		res.forEach(r -> System.out.println(r));
		em.getTransaction().commit();

		scanner.close();

		em.getTransaction().begin();
		Query query = em.createQuery("DELETE Capitulo");
		query.executeUpdate();
		em.getTransaction().commit();

		em.getTransaction().begin();
		query = em.createQuery("DELETE Libro");
		query.executeUpdate();
		em.getTransaction().commit();

		em.getTransaction().begin();
		query = em.createQuery("DELETE Persona");
		query.executeUpdate();
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
