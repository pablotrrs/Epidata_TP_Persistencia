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
import edu.epidata.dto.ReporteDTO;
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
		TypedQuery<ReporteDTO> tpQuery = em
				.createQuery(
						"SELECT new " + "edu.epidata.dto.ReporteDTO(p.id, count(distinct l.id))"
								+ " FROM Capitulo c JOIN c.autores p JOIN c.libro l " + " GROUP BY p.id",
						ReporteDTO.class);

		List<ReporteDTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<ReporteDTO> esperado = cantidadEscritos();
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

	private List<ReporteDTO> cantidadEscritos() {
		List<ReporteDTO> esperado = new ArrayList<ReporteDTO>();
		esperado.add(new ReporteDTO(1, 8));
		esperado.add(new ReporteDTO(2, 5));
		esperado.add(new ReporteDTO(3, 6));
		esperado.add(new ReporteDTO(4, 6));
		esperado.add(new ReporteDTO(5, 2));
		esperado.add(new ReporteDTO(6, 2));
		esperado.add(new ReporteDTO(7, 5));
		esperado.add(new ReporteDTO(8, 4));
		esperado.add(new ReporteDTO(9, 3));
		esperado.add(new ReporteDTO(10, 5));
		esperado.add(new ReporteDTO(11, 4));
		esperado.add(new ReporteDTO(12, 6));
		esperado.add(new ReporteDTO(13, 5));
		esperado.add(new ReporteDTO(14, 5));
		esperado.add(new ReporteDTO(15, 6));
		esperado.add(new ReporteDTO(16, 6));
		esperado.add(new ReporteDTO(17, 4));
		esperado.add(new ReporteDTO(18, 3));
		esperado.add(new ReporteDTO(19, 2));
		esperado.add(new ReporteDTO(20, 4));
		esperado.add(new ReporteDTO(21, 4));
		esperado.add(new ReporteDTO(22, 5));
		esperado.add(new ReporteDTO(23, 7));
		esperado.add(new ReporteDTO(24, 6));
		esperado.add(new ReporteDTO(25, 4));
		esperado.add(new ReporteDTO(26, 4));
		esperado.add(new ReporteDTO(27, 7));
		esperado.add(new ReporteDTO(28, 5));
		esperado.add(new ReporteDTO(29, 3));
		esperado.add(new ReporteDTO(30, 8));
		esperado.add(new ReporteDTO(31, 2));
		esperado.add(new ReporteDTO(32, 4));
		esperado.add(new ReporteDTO(33, 3));
		esperado.add(new ReporteDTO(34, 4));
		esperado.add(new ReporteDTO(35, 3));
		esperado.add(new ReporteDTO(36, 4));
		esperado.add(new ReporteDTO(37, 2));
		esperado.add(new ReporteDTO(38, 4));
		esperado.add(new ReporteDTO(39, 3));
		esperado.add(new ReporteDTO(40, 4));
		esperado.add(new ReporteDTO(41, 4));
		esperado.add(new ReporteDTO(42, 7));
		esperado.add(new ReporteDTO(43, 4));
		esperado.add(new ReporteDTO(44, 5));
		esperado.add(new ReporteDTO(45, 5));
		esperado.add(new ReporteDTO(46, 5));
		esperado.add(new ReporteDTO(47, 6));
		esperado.add(new ReporteDTO(48, 4));
		esperado.add(new ReporteDTO(49, 5));
		esperado.add(new ReporteDTO(50, 7));
		return esperado;
	}
}
