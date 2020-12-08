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

public class PaginasRevisadasTest {

	private TypedQuery<ReportePersonaCantidadDTO> tpQuery;

	@BeforeClass
	public static void setUp() throws FileNotFoundException, IOException {
		CargaDatos.cargar();
	}

	@Test
	public void anioSinPaginasRevisadas() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 2020);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados2020();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas2017() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 2017);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados2017();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas2016() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 2016);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados2016();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas2013() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 2013);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados2013();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas2005() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 2005);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados2005();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas1996() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 1996);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados1996();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas1994() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 1994);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados1994();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas1990() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 1990);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados1990();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas1989() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 1989);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados1989();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void paginasRevisadas1984() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				ReportePersonaCantidadDTO.class);
		tpQuery.setParameter("anio", 1984);

		List<ReportePersonaCantidadDTO> obtenido = tpQuery.getResultList();

		commitAndClose(emf, em);

		List<ReportePersonaCantidadDTO> esperado = esperados1984();

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
		commitAndClose(emf, em);
	}

	private static void commitAndClose(EntityManagerFactory emf, EntityManager em) {
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	private List<ReportePersonaCantidadDTO> esperados2020() {
		return new ArrayList<ReportePersonaCantidadDTO>();
	}

	private List<ReportePersonaCantidadDTO> esperados2017() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(7, 1));
		esperado.add(new ReportePersonaCantidadDTO(8, 1));
		esperado.add(new ReportePersonaCantidadDTO(11, 1));
		esperado.add(new ReportePersonaCantidadDTO(13, 2));
		esperado.add(new ReportePersonaCantidadDTO(22, 1));
		esperado.add(new ReportePersonaCantidadDTO(23, 1));
		esperado.add(new ReportePersonaCantidadDTO(26, 1));
		esperado.add(new ReportePersonaCantidadDTO(28, 1));
		esperado.add(new ReportePersonaCantidadDTO(29, 1));
		esperado.add(new ReportePersonaCantidadDTO(35, 1));
		esperado.add(new ReportePersonaCantidadDTO(36, 1));
		esperado.add(new ReportePersonaCantidadDTO(38, 2));
		esperado.add(new ReportePersonaCantidadDTO(39, 1));
		esperado.add(new ReportePersonaCantidadDTO(41, 1));
		esperado.add(new ReportePersonaCantidadDTO(42, 1));
		esperado.add(new ReportePersonaCantidadDTO(47, 1));
		esperado.add(new ReportePersonaCantidadDTO(48, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2016() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(12, 1));
		esperado.add(new ReportePersonaCantidadDTO(13, 1));
		esperado.add(new ReportePersonaCantidadDTO(15, 1));
		esperado.add(new ReportePersonaCantidadDTO(18, 1));
		esperado.add(new ReportePersonaCantidadDTO(23, 1));
		esperado.add(new ReportePersonaCantidadDTO(25, 1));
		esperado.add(new ReportePersonaCantidadDTO(33, 1));
		esperado.add(new ReportePersonaCantidadDTO(48, 1));
		esperado.add(new ReportePersonaCantidadDTO(49, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2013() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(3, 1));
		esperado.add(new ReportePersonaCantidadDTO(6, 1));
		esperado.add(new ReportePersonaCantidadDTO(7, 2));
		esperado.add(new ReportePersonaCantidadDTO(10, 1));
		esperado.add(new ReportePersonaCantidadDTO(15, 2));
		esperado.add(new ReportePersonaCantidadDTO(23, 1));
		esperado.add(new ReportePersonaCantidadDTO(30, 1));
		esperado.add(new ReportePersonaCantidadDTO(31, 1));
		esperado.add(new ReportePersonaCantidadDTO(34, 1));
		esperado.add(new ReportePersonaCantidadDTO(37, 1));
		esperado.add(new ReportePersonaCantidadDTO(38, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2005() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(8, 1));
		esperado.add(new ReportePersonaCantidadDTO(9, 1));
		esperado.add(new ReportePersonaCantidadDTO(19, 1));
		esperado.add(new ReportePersonaCantidadDTO(21, 1));
		esperado.add(new ReportePersonaCantidadDTO(30, 1));
		esperado.add(new ReportePersonaCantidadDTO(31, 1));
		esperado.add(new ReportePersonaCantidadDTO(35, 1));
		esperado.add(new ReportePersonaCantidadDTO(42, 2));
		esperado.add(new ReportePersonaCantidadDTO(48, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1996() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(2, 1));
		esperado.add(new ReportePersonaCantidadDTO(8, 1));
		esperado.add(new ReportePersonaCantidadDTO(14, 2));
		esperado.add(new ReportePersonaCantidadDTO(30, 1));
		esperado.add(new ReportePersonaCantidadDTO(36, 1));
		esperado.add(new ReportePersonaCantidadDTO(43, 1));
		esperado.add(new ReportePersonaCantidadDTO(44, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1994() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(16, 1));
		esperado.add(new ReportePersonaCantidadDTO(18, 1));
		esperado.add(new ReportePersonaCantidadDTO(19, 1));
		esperado.add(new ReportePersonaCantidadDTO(20, 1));
		esperado.add(new ReportePersonaCantidadDTO(22, 1));
		esperado.add(new ReportePersonaCantidadDTO(32, 1));
		esperado.add(new ReportePersonaCantidadDTO(34, 1));
		esperado.add(new ReportePersonaCantidadDTO(38, 1));
		esperado.add(new ReportePersonaCantidadDTO(39, 1));
		esperado.add(new ReportePersonaCantidadDTO(45, 1));
		esperado.add(new ReportePersonaCantidadDTO(49, 1));
		esperado.add(new ReportePersonaCantidadDTO(50, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1990() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(13, 1));
		esperado.add(new ReportePersonaCantidadDTO(19, 1));
		esperado.add(new ReportePersonaCantidadDTO(20, 1));
		esperado.add(new ReportePersonaCantidadDTO(26, 2));
		esperado.add(new ReportePersonaCantidadDTO(27, 1));
		esperado.add(new ReportePersonaCantidadDTO(40, 1));
		esperado.add(new ReportePersonaCantidadDTO(42, 1));
		esperado.add(new ReportePersonaCantidadDTO(44, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1989() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(1, 1));
		esperado.add(new ReportePersonaCantidadDTO(4, 1));
		esperado.add(new ReportePersonaCantidadDTO(10, 1));
		esperado.add(new ReportePersonaCantidadDTO(13, 1));
		esperado.add(new ReportePersonaCantidadDTO(19, 1));
		esperado.add(new ReportePersonaCantidadDTO(20, 2));
		esperado.add(new ReportePersonaCantidadDTO(35, 1));
		esperado.add(new ReportePersonaCantidadDTO(42, 1));
		esperado.add(new ReportePersonaCantidadDTO(48, 1));
		esperado.add(new ReportePersonaCantidadDTO(49, 1));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1984() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(4, 1));
		esperado.add(new ReportePersonaCantidadDTO(6, 1));
		esperado.add(new ReportePersonaCantidadDTO(12, 1));
		esperado.add(new ReportePersonaCantidadDTO(16, 1));
		esperado.add(new ReportePersonaCantidadDTO(18, 1));
		esperado.add(new ReportePersonaCantidadDTO(32, 1));
		esperado.add(new ReportePersonaCantidadDTO(39, 1));
		esperado.add(new ReportePersonaCantidadDTO(44, 1));
		esperado.add(new ReportePersonaCantidadDTO(45, 1));
		return esperado;
	}
}
