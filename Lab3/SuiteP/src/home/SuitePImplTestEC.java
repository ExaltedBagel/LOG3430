package home;

import static org.junit.Assert.*;

import org.junit.Test;

import pile.PileImpl;
import home.SuitePImpl;

/****************************************************/
/* Les tests sont nommés de la manière suivante:	*/
/*													*/
/* testSuitePECx: correspond au test de la suite EC	*/
/*				  de numéro x						*/
/*													*/
/* testSuitePACx: correspond au test de la suite AC	*/
/*				  de numéro x						*/
/****************************************************/

public class SuitePImplTestEC {

	@Test
	public void testSuitePEC1() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 2, -1, 4);
		assertEquals("La taille de la pile devrait être 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait être 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait être 1", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être -1", -1, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 2", 2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC2() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 2, -1, 4);
		pile = (PileImpl)suite.build("soust", 0, 5, 5);
		assertEquals("La taille de la pile devrait être 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait être -15", -15, (int)pile.depiler());
		assertEquals("La valeur [4] devrait être 10", 10, (int)pile.depiler());
		assertEquals("La valeur [3] devrait être -5", -5, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 0", 0, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC3() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", -10, 5, 3);
		assertEquals("La taille de la pile devrait être 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait être -50", -50, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être -10", -10, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC4() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 7, 3);
		assertEquals("La taille de la pile devrait être 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait être 2", 2, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 7", 7, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 14", 14, (int)pile.depiler());	
	}	
}
