package operations;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest{
	
	// Test la méthode de multiplication. 
	@Test
	public void testMultiply()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 6", 6, calc.multiply(2, 3));
	}
	
	// Test la méthode de division
	@Test
	public void testDivide()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 4", 4, calc.divide(8, 2));
	}
	
	// Test la méthode d'addition
	@Test
	public void testAdd()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 10", 10, calc.add(8, 2));
	}
	
	// Test la méthode de soustraction
	@Test
	public void testSubtract()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 6", 6, calc.substract(8, 2));
	}
}