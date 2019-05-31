package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMakeWall() {
		Entity test = entity.EntityFactory.makeWall(1, 1);
		assertNotNull(test);
	}

	@Test
	public void testMakeFilledDirt() {
		Entity test = entity.EntityFactory.makeFilledDirt(1, 1);
		assertNotNull(test);
	}

	@Test
	public void testMakeDugDirt() {
		Entity test = entity.EntityFactory.makeDugDirt(1, 1);
		assertNotNull(test);
	}	
	@Test
	public void testMakeExitPortal() {
		Entity test = entity.EntityFactory.makeExitPortal(1, 1);
		assertNotNull(test);
	}

}
