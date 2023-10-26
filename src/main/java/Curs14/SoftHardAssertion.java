package Curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {
	
	@Test
	public void softAssertion() {
		System.out.println("Soft assertion incepe aici!");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft assert continua aici!");
		sa.assertEquals(20, 4);
		System.out.println("Soft assert se termina aici!");
		sa.assertAll();    //este mandatory in cazul SoftAssert
		
	}
	
	@Test
	public void hardAssert() {
		System.out.println("HARD assertion incepe aici!");
		assertTrue(false);
		System.out.println("HARD assert continua aici!");
		assertEquals(20, 4);
		System.out.println("HARD assert se termina aici!");

	}
	
	
	

}
