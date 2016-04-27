package edu.towson.cis.cosc603.project5.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName((String) null);
		fixture.setPrice(1);
		Recipe r = new Recipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		Recipe r = new Recipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		Recipe r = new Recipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = new Recipe();
		fixture.setAmtSugar(1);
		fixture.setAmtMilk(1);
		fixture.setAmtChocolate(1);
		fixture.setAmtCoffee(1);
		fixture.setName("");
		fixture.setPrice(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/27/16 6:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}
