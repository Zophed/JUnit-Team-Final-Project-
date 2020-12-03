/*
 * Team 10:
 * Anthony Onstott
 * Nathan Nelson
 * Carl Painter
 * Zachary Riggle
 * 
 * 	This class will test for 3 of the most likely scenarios in which the Fraction class would not
 * 		be able to perform the required operations correctly. This will cause an error to be thrown,
 * 		and then the program will end. The testing environment will test all these different situations
 * 		without ending the program.
 */

package fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IllegalArgumentJupiter {


	@Test
	public void testFraction() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			Fraction test = new Fraction(1,0);});
		assertEquals("The denominator with the value of 0 is not permitted", exception.getMessage());
	}

	@Test
	public void testAdd() {
		Fraction test = new Fraction(1,1);
	    Fraction test2 = null;
	    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			test.add(test2);});
	    assertEquals("Cannot perform math operations on a null fraction object!", exception.getMessage());
	    
	}

	@Test
	public void testMultiply() {
		Fraction test = new Fraction(1,1);
	    Fraction test2 = null;
	    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			test.multiply(test2);});
	    assertEquals("Cannot perform math operations on a null fraction object!", exception.getMessage());
	    
	}

}
