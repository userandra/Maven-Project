package Curs14;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AssertionEx {
	
	String expected = "test";
	String actual = "masina";	
	
	@Test
	public void test1() {
		if (expected.equals(actual)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");		
		}	

}
	@Test
	public void test2() {
		assertEquals(expected, actual);
	}
	
	
}
	
