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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		tpQuery = em.createQuery("SELECT new " + "edu.epidata.dto.ReportePersonaCantidadDTO(p.id, sum(c.paginas))"
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
		esperado.add(new ReportePersonaCantidadDTO(7, 437));
		esperado.add(new ReportePersonaCantidadDTO(8, 5415));
		esperado.add(new ReportePersonaCantidadDTO(11, 5495));
		esperado.add(new ReportePersonaCantidadDTO(13, 13505));
		esperado.add(new ReportePersonaCantidadDTO(22, 3638));
		esperado.add(new ReportePersonaCantidadDTO(23, 7150));
		esperado.add(new ReportePersonaCantidadDTO(26, 5765));
		esperado.add(new ReportePersonaCantidadDTO(28, 9699));
		esperado.add(new ReportePersonaCantidadDTO(29, 7590));
		esperado.add(new ReportePersonaCantidadDTO(35, 1059));
		esperado.add(new ReportePersonaCantidadDTO(36, 4863));
		esperado.add(new ReportePersonaCantidadDTO(38, 1935));
		esperado.add(new ReportePersonaCantidadDTO(39, 9285));
		esperado.add(new ReportePersonaCantidadDTO(41, 549));
		esperado.add(new ReportePersonaCantidadDTO(42, 8618));
		esperado.add(new ReportePersonaCantidadDTO(47, 3749));
		esperado.add(new ReportePersonaCantidadDTO(48, 156));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2016() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(12, 3324));
		esperado.add(new ReportePersonaCantidadDTO(13, 436));
		esperado.add(new ReportePersonaCantidadDTO(15, 7980));
		esperado.add(new ReportePersonaCantidadDTO(18, 1173));
		esperado.add(new ReportePersonaCantidadDTO(23, 7468));
		esperado.add(new ReportePersonaCantidadDTO(25, 600));
		esperado.add(new ReportePersonaCantidadDTO(33, 706));
		esperado.add(new ReportePersonaCantidadDTO(48, 8758));
		esperado.add(new ReportePersonaCantidadDTO(49, 2172));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2013() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(3, 6614));
		esperado.add(new ReportePersonaCantidadDTO(6, 8915));
		esperado.add(new ReportePersonaCantidadDTO(7, 10826));
		esperado.add(new ReportePersonaCantidadDTO(10, 298));
		esperado.add(new ReportePersonaCantidadDTO(15, 6446));
		esperado.add(new ReportePersonaCantidadDTO(23, 3685));
		esperado.add(new ReportePersonaCantidadDTO(30, 2076));
		esperado.add(new ReportePersonaCantidadDTO(31, 1432));
		esperado.add(new ReportePersonaCantidadDTO(34, 2016));
		esperado.add(new ReportePersonaCantidadDTO(37, 7788));
		esperado.add(new ReportePersonaCantidadDTO(38, 8955));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados2005() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(8, 4751));
		esperado.add(new ReportePersonaCantidadDTO(9, 8205));
		esperado.add(new ReportePersonaCantidadDTO(19, 7006));
		esperado.add(new ReportePersonaCantidadDTO(21, 2983));
		esperado.add(new ReportePersonaCantidadDTO(30, 449));
		esperado.add(new ReportePersonaCantidadDTO(31, 5059));
		esperado.add(new ReportePersonaCantidadDTO(35, 3092));
		esperado.add(new ReportePersonaCantidadDTO(42, 9614));
		esperado.add(new ReportePersonaCantidadDTO(48, 5171));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1996() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(2, 8444));
		esperado.add(new ReportePersonaCantidadDTO(8, 5961));
		esperado.add(new ReportePersonaCantidadDTO(14, 6193));
		esperado.add(new ReportePersonaCantidadDTO(30, 8256));
		esperado.add(new ReportePersonaCantidadDTO(36, 4994));
		esperado.add(new ReportePersonaCantidadDTO(43, 3637));
		esperado.add(new ReportePersonaCantidadDTO(44, 7333));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1994() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(16, 5963));
		esperado.add(new ReportePersonaCantidadDTO(18, 3143));
		esperado.add(new ReportePersonaCantidadDTO(19, 504));
		esperado.add(new ReportePersonaCantidadDTO(20, 8186));
		esperado.add(new ReportePersonaCantidadDTO(22, 7739));
		esperado.add(new ReportePersonaCantidadDTO(32, 4369));
		esperado.add(new ReportePersonaCantidadDTO(34, 2755));
		esperado.add(new ReportePersonaCantidadDTO(38, 8308));
		esperado.add(new ReportePersonaCantidadDTO(39, 6771));
		esperado.add(new ReportePersonaCantidadDTO(45, 7395));
		esperado.add(new ReportePersonaCantidadDTO(49, 1974));
		esperado.add(new ReportePersonaCantidadDTO(50, 2));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1990() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(13, 4528));
		esperado.add(new ReportePersonaCantidadDTO(19, 5562));
		esperado.add(new ReportePersonaCantidadDTO(20, 1363));
		esperado.add(new ReportePersonaCantidadDTO(26, 15426));
		esperado.add(new ReportePersonaCantidadDTO(27, 6471));
		esperado.add(new ReportePersonaCantidadDTO(40, 2966));
		esperado.add(new ReportePersonaCantidadDTO(42, 581));
		esperado.add(new ReportePersonaCantidadDTO(44, 8216));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1989() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(1, 3076));
		esperado.add(new ReportePersonaCantidadDTO(4, 9984));
		esperado.add(new ReportePersonaCantidadDTO(10, 9534));
		esperado.add(new ReportePersonaCantidadDTO(13, 7805));
		esperado.add(new ReportePersonaCantidadDTO(19, 1953));
		esperado.add(new ReportePersonaCantidadDTO(20, 9926));
		esperado.add(new ReportePersonaCantidadDTO(35, 7133));
		esperado.add(new ReportePersonaCantidadDTO(42, 8907));
		esperado.add(new ReportePersonaCantidadDTO(48, 4037));
		esperado.add(new ReportePersonaCantidadDTO(49, 5290));
		return esperado;
	}

	private List<ReportePersonaCantidadDTO> esperados1984() {
		List<ReportePersonaCantidadDTO> esperado = new ArrayList<ReportePersonaCantidadDTO>();
		esperado.add(new ReportePersonaCantidadDTO(4, 9034));
		esperado.add(new ReportePersonaCantidadDTO(6, 9052));
		esperado.add(new ReportePersonaCantidadDTO(12, 7125));
		esperado.add(new ReportePersonaCantidadDTO(16, 5261));
		esperado.add(new ReportePersonaCantidadDTO(18, 9733));
		esperado.add(new ReportePersonaCantidadDTO(32, 2678));
		esperado.add(new ReportePersonaCantidadDTO(39, 4881));
		esperado.add(new ReportePersonaCantidadDTO(44, 3302));
		esperado.add(new ReportePersonaCantidadDTO(45, 9435));
		return esperado;
	}
}
