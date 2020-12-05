package edu.epidata.tests;

import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import edu.epidata.dto.Reporte1DTO;
import edu.epidata.jpa.CargaDatos;

public class AutoresCapitulosTest {

	@BeforeClass
	public static void setUp() throws FileNotFoundException, IOException {
		CargaDatos.cargar();
	}

	@Test
	public void autoresCapitulos() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		TypedQuery<Reporte1DTO> tpQuery = em.createQuery(
				"SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(distinct l.id))"
						+ " FROM Capitulo c JOIN c.autores p JOIN c.libro l " + "WHERE p.id = 1" + " GROUP BY p.id",
				Reporte1DTO.class);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = cantidadEscritos();
		assertEquals(esperado, obtenido);
	}

	@AfterClass
	public static void after() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

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

	private List<Reporte1DTO> cantidadEscritos() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(1, 8));
		return esperado;
	}
}
