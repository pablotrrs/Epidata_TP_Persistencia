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
import edu.epidata.dto.ReportePersonaCantidadDTO;
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
		TypedQuery<ReportePersonaCantidadDTO> tpQuery = em
				.createQuery(
						"SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(distinct l.id))"
								+ " FROM Capitulo c JOIN c.autores p JOIN c.libro l " + " GROUP BY p.id",
						ReportePersonaCantidadDTO.class);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<ReportePersonaCantidadDTO> esperado = cantidadEscritos();
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

	private List<ReportePersonaCantidadDTO> cantidadEscritos() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(1, 8));
		esperado.add(new ReportePersonaCantidadDTO(2, 5));
		esperado.add(new ReportePersonaCantidadDTO(3, 6));
		esperado.add(new ReportePersonaCantidadDTO(4, 6));
		esperado.add(new ReportePersonaCantidadDTO(5, 2));
		esperado.add(new ReportePersonaCantidadDTO(6, 2));
		esperado.add(new ReportePersonaCantidadDTO(7, 5));
		esperado.add(new ReportePersonaCantidadDTO(8, 4));
		esperado.add(new ReportePersonaCantidadDTO(9, 3));
		esperado.add(new ReportePersonaCantidadDTO(10, 5));
		esperado.add(new ReportePersonaCantidadDTO(11, 4));
		esperado.add(new ReportePersonaCantidadDTO(12, 6));
		esperado.add(new ReportePersonaCantidadDTO(13, 5));
		esperado.add(new ReportePersonaCantidadDTO(14, 5));
		esperado.add(new ReportePersonaCantidadDTO(15, 6));
		esperado.add(new ReportePersonaCantidadDTO(16, 6));
		esperado.add(new ReportePersonaCantidadDTO(17, 4));
		esperado.add(new ReportePersonaCantidadDTO(18, 3));
		esperado.add(new ReportePersonaCantidadDTO(19, 2));
		esperado.add(new ReportePersonaCantidadDTO(20, 4));
		esperado.add(new ReportePersonaCantidadDTO(21, 4));
		esperado.add(new ReportePersonaCantidadDTO(22, 5));
		esperado.add(new ReportePersonaCantidadDTO(23, 7));
		esperado.add(new ReportePersonaCantidadDTO(24, 6));
		esperado.add(new ReportePersonaCantidadDTO(25, 4));
		esperado.add(new ReportePersonaCantidadDTO(26, 4));
		esperado.add(new ReportePersonaCantidadDTO(27, 7));
		esperado.add(new ReportePersonaCantidadDTO(28, 5));
		esperado.add(new ReportePersonaCantidadDTO(29, 3));
		esperado.add(new ReportePersonaCantidadDTO(30, 8));
		esperado.add(new ReportePersonaCantidadDTO(31, 2));
		esperado.add(new ReportePersonaCantidadDTO(32, 4));
		esperado.add(new ReportePersonaCantidadDTO(33, 3));
		esperado.add(new ReportePersonaCantidadDTO(34, 4));
		esperado.add(new ReportePersonaCantidadDTO(35, 3));
		esperado.add(new ReportePersonaCantidadDTO(36, 4));
		esperado.add(new ReportePersonaCantidadDTO(37, 2));
		esperado.add(new ReportePersonaCantidadDTO(38, 4));
		esperado.add(new ReportePersonaCantidadDTO(39, 3));
		esperado.add(new ReportePersonaCantidadDTO(40, 4));
		esperado.add(new ReportePersonaCantidadDTO(41, 4));
		esperado.add(new ReportePersonaCantidadDTO(42, 7));
		esperado.add(new ReportePersonaCantidadDTO(43, 4));
		esperado.add(new ReportePersonaCantidadDTO(44, 5));
		esperado.add(new ReportePersonaCantidadDTO(45, 5));
		esperado.add(new ReportePersonaCantidadDTO(46, 5));
		esperado.add(new ReportePersonaCantidadDTO(47, 6));
		esperado.add(new ReportePersonaCantidadDTO(48, 4));
		esperado.add(new ReportePersonaCantidadDTO(49, 5));
		esperado.add(new ReportePersonaCantidadDTO(50, 7));
		return esperado;
	}
}
