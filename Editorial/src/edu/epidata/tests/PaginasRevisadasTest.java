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

public class PaginasRevisadasTest {

	private TypedQuery<Reporte1DTO> tpQuery;

	@BeforeClass
	public static void setUp() throws FileNotFoundException, IOException {
		CargaDatos.cargar();
	}

	@Test
	public void paginasRevisadas2017() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 2017);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados2017();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2016() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 2016);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados2016();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2013() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 2013);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados2013();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados2005() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 2005);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados2005();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1996() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 1996);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados1996();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1994() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 1994);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados1994();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1990() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 1990);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados1990();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1989() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 1989);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados1989();

		assertEquals(esperado, obtenido);
	}

	@Test
	public void librosEditados1984() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Editorial");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.Reporte1DTO(p.id, count(*))"
				+ " FROM Capitulo c JOIN c.revisor p JOIN c.libro l" + " WHERE l.anio = :anio" + " GROUP BY p.id ",
				Reporte1DTO.class);
		tpQuery.setParameter("anio", 1984);

		List<Reporte1DTO> obtenido = tpQuery.getResultList();

		em.getTransaction().commit();
		em.close();
		emf.close();

		List<Reporte1DTO> esperado = esperados1984();

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

	private List<Reporte1DTO> esperados2017() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(7, 1));
		esperado.add(new Reporte1DTO(8, 1));
		esperado.add(new Reporte1DTO(11, 1));
		esperado.add(new Reporte1DTO(13, 2));
		esperado.add(new Reporte1DTO(22, 1));
		esperado.add(new Reporte1DTO(23, 1));
		esperado.add(new Reporte1DTO(26, 1));
		esperado.add(new Reporte1DTO(28, 1));
		esperado.add(new Reporte1DTO(29, 1));
		esperado.add(new Reporte1DTO(35, 1));
		esperado.add(new Reporte1DTO(36, 1));
		esperado.add(new Reporte1DTO(38, 2));
		esperado.add(new Reporte1DTO(39, 1));
		esperado.add(new Reporte1DTO(41, 1));
		esperado.add(new Reporte1DTO(42, 1));
		esperado.add(new Reporte1DTO(47, 1));
		esperado.add(new Reporte1DTO(48, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados2016() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(12, 1));
		esperado.add(new Reporte1DTO(13, 1));
		esperado.add(new Reporte1DTO(15, 1));
		esperado.add(new Reporte1DTO(18, 1));
		esperado.add(new Reporte1DTO(23, 1));
		esperado.add(new Reporte1DTO(25, 1));
		esperado.add(new Reporte1DTO(33, 1));
		esperado.add(new Reporte1DTO(48, 1));
		esperado.add(new Reporte1DTO(49, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados2013() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(3, 1));
		esperado.add(new Reporte1DTO(6, 1));
		esperado.add(new Reporte1DTO(7, 2));
		esperado.add(new Reporte1DTO(10, 1));
		esperado.add(new Reporte1DTO(15, 2));
		esperado.add(new Reporte1DTO(23, 1));
		esperado.add(new Reporte1DTO(30, 1));
		esperado.add(new Reporte1DTO(31, 1));
		esperado.add(new Reporte1DTO(34, 1));
		esperado.add(new Reporte1DTO(37, 1));
		esperado.add(new Reporte1DTO(38, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados2005() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(8, 1));
		esperado.add(new Reporte1DTO(9, 1));
		esperado.add(new Reporte1DTO(19, 1));
		esperado.add(new Reporte1DTO(21, 1));
		esperado.add(new Reporte1DTO(30, 1));
		esperado.add(new Reporte1DTO(31, 1));
		esperado.add(new Reporte1DTO(35, 1));
		esperado.add(new Reporte1DTO(42, 2));
		esperado.add(new Reporte1DTO(48, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados1996() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(2, 1));
		esperado.add(new Reporte1DTO(8, 1));
		esperado.add(new Reporte1DTO(14, 2));
		esperado.add(new Reporte1DTO(30, 1));
		esperado.add(new Reporte1DTO(36, 1));
		esperado.add(new Reporte1DTO(43, 1));
		esperado.add(new Reporte1DTO(44, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados1994() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(16, 1));
		esperado.add(new Reporte1DTO(18, 1));
		esperado.add(new Reporte1DTO(19, 1));
		esperado.add(new Reporte1DTO(20, 1));
		esperado.add(new Reporte1DTO(22, 1));
		esperado.add(new Reporte1DTO(32, 1));
		esperado.add(new Reporte1DTO(34, 1));
		esperado.add(new Reporte1DTO(38, 1));
		esperado.add(new Reporte1DTO(39, 1));
		esperado.add(new Reporte1DTO(45, 1));
		esperado.add(new Reporte1DTO(49, 1));
		esperado.add(new Reporte1DTO(50, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados1990() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(13, 1));
		esperado.add(new Reporte1DTO(19, 1));
		esperado.add(new Reporte1DTO(20, 1));
		esperado.add(new Reporte1DTO(26, 2));
		esperado.add(new Reporte1DTO(27, 1));
		esperado.add(new Reporte1DTO(40, 1));
		esperado.add(new Reporte1DTO(42, 1));
		esperado.add(new Reporte1DTO(44, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados1989() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(1, 1));
		esperado.add(new Reporte1DTO(4, 1));
		esperado.add(new Reporte1DTO(10, 1));
		esperado.add(new Reporte1DTO(13, 1));
		esperado.add(new Reporte1DTO(19, 1));
		esperado.add(new Reporte1DTO(20, 2));
		esperado.add(new Reporte1DTO(35, 1));
		esperado.add(new Reporte1DTO(42, 1));
		esperado.add(new Reporte1DTO(48, 1));
		esperado.add(new Reporte1DTO(49, 1));
		return esperado;
	}

	private List<Reporte1DTO> esperados1984() {
		List<Reporte1DTO> esperado = new ArrayList<Reporte1DTO>();
		esperado.add(new Reporte1DTO(4, 1));
		esperado.add(new Reporte1DTO(6, 1));
		esperado.add(new Reporte1DTO(12, 1));
		esperado.add(new Reporte1DTO(16, 1));
		esperado.add(new Reporte1DTO(18, 1));
		esperado.add(new Reporte1DTO(32, 1));
		esperado.add(new Reporte1DTO(39, 1));
		esperado.add(new Reporte1DTO(44, 1));
		esperado.add(new Reporte1DTO(45, 1));
		return esperado;
	}
}
