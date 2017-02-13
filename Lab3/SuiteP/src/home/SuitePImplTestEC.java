package home;

import static org.junit.Assert.*;

import org.junit.Test;

import pile.PileImpl;
import home.SuitePImpl;

/****************************************************/
/* Les tests sont nomm�s de la mani�re suivante:	*/
/*													*/
/* testSuitePECx: correspond au test de la suite EC	*/
/*				  de num�ro x						*/
/*													*/
/* testSuitePACx: correspond au test de la suite AC	*/
/*				  de num�ro x						*/
/****************************************************/

public class SuitePImplTestEC {

	@Test
	public void testSuitePEC1() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 2, -1, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 1", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -1", -1, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 2", 2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC2() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 2, -1, 4);
		pile = (PileImpl)suite.build("soust", 0, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre -15", -15, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 10", 10, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre -5", -5, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC3() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", -10, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre -50", -50, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -10", -10, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePEC4() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 7, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 2", 2, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 7", 7, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 14", 14, (int)pile.depiler());	
	}	
}
