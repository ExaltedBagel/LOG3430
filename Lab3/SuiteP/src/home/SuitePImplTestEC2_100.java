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

public class SuitePImplTestEC2_100 {

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
	
	///ajouter
	@Test
	public void testSuitePEC5() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 7, 11);
		assertEquals("taille chaine doit etre inferieur/egal a 10", 0, pile.getSize());
	}	
	
	@Test
	public void testSuitePEC6() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 13, 7, 3);
		assertEquals("deuxieme parametre de suiteP doit etre paire", 0, pile.getSize());
	}	
	
	@Test
	public void testSuitePEC7() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 6, 3);
		assertEquals("deuxieme parametre de suiteP doit etre impaire", 0, pile.getSize());
	}	
		
	@Test
	public void testSuitePEC8() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 7, 3);
		suite.printPile(pile);
		assertEquals("print devrait vider la pile", 0, pile.getSize());
	}	
	
	@Test
	public void testSuitePEC9() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 13, 6);
		assertEquals("le reste de la pile ne peut etre calculer a cause de la division par zero", 5, pile.getSize());
	}
	
	@Test
	public void testSuitePEC10() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("Syskey", 14, 13, 6);
		assertEquals("La taille de la pile devrait être 2", 2, pile.getSize());
	}
	@Test
	public void testSuitePEC11() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, 13, 0);
		assertEquals("La taille de la pile devrait être 0", 0, pile.getSize());
	}
	
	@Test						
	public void testSuitePEC12() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", 14, -1, 3);
		assertEquals("La valeur [3] devrait être -14", -14, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être -1", -1, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 14", 14, (int)pile.depiler());
	}
	
	@Test						
	public void testSuitePEC13() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", -14, -1, 3);
		assertEquals("La valeur [3] devrait être -14", 14, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être -1", -1, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 14", -14, (int)pile.depiler());
	}
	
	@Test						
	public void testSuitePEC14() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 14, -1, 3);
		assertEquals("La valeur [3] devrait être -14", -14, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être -1", -1, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 14", 14, (int)pile.depiler());
	}
	
	@Test						
	public void testSuitePEC15() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 2, 3, 3);
		assertEquals("La valeur [3] devrait être 0", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 3", 3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 2", 2, (int)pile.depiler());
	}
	
	@Test						
	public void testSuitePEC16() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add",6, -3, 5);
		assertEquals("La valeur [5] devrait être 0", 3, (int)pile.depiler());
		assertEquals("La valeur [4] devrait être 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait être 0", 3, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 2", 6, (int)pile.depiler());
	}
	
	@Test						
	public void testSuitePEC17() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust",-6, -3, 5);
		assertEquals("La valeur [5] devrait être 0", -3, (int)pile.depiler());
		assertEquals("La valeur [4] devrait être 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait être 0", -3, (int)pile.depiler());
		assertEquals("La valeur [2] devrait être 3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait être 2", -6, (int)pile.depiler());
	}
	
}
