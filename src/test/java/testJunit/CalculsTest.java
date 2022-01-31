package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author test
 * 
 */
class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // Déclencher cette méthode avant l'ex�cution
	void setUp() throws Exception 
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
	}
	
	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() 
	{
		if (c1.multiplier() != 2)
		{
			fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
		}
		if (c2.multiplier() != 200)
		{
			fail("Methode multiplier non conforme 10*20=200 ne fonctionne pas.");			
		}
		if (c3.multiplier() != 20000)
		{
			fail("Methode multiplier non conforme 100*200=20000 ne fonctionne pas.");			
		}

		
		// Est ce que (2 == 42) ? non donc : test en Erreur
		assertEquals(c1.multiplier(), 2, "Methode multiplier non conforme 2*1=2 ne fonctionne pas.");

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		if (c1.additioner() != 3)
		{
			fail("Methode additionner non conforme 2+1=3 ne fonctionne pas.");
		}
		if (c2.additioner() != 30)
		{
			fail("Methode additionner non conforme 10+20=30 ne fonctionne pas.");			
		}
		if (c3.additioner() != 300)
		{
			fail("Methode additionner non conforme 100+200=300 ne fonctionne pas.");			
		}

		
		// Est ce que (2 == 42) ? non donc : test en Erreur
		assertEquals(c1.additioner(), 3, "Methode additionner non conforme 2+1=3 ne fonctionne pas.");
	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		fail("Not yet implemented");
	}

}