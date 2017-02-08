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

public class SuitePImplTest {

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
	
	@Test
	public void testSuitePAC1() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", -2, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -1", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());	
	}
	
	@Test
	public void testSuitePAC2() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", -2, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 3", 3, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC3() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 0, -3, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre -6", -6, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC4() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 0, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre 15", 15, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 10", 10, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC5() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 4, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC6() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("add", 4, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 9", 9, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC7() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", -2, -3, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre -4", -4, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 1", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC8() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", -2, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre -19", -19, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 12", 12, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre -7", -7, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC9() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", 0, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC10() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", 0, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre -5", -5, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC11() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", 4, -3, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre -10", -10, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 7", 7, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC12() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("soust", 4, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre -7", -7, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 6", 6, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre -1", -1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC13() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", -2, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC14() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", -2, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre -10", -10, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC15() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", 0, -3, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC16() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", 0, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());
	}
		
	@Test
	public void testSuitePAC17() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", 4, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC18() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("mult", 4, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 20", 20, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC19() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", -2, -3, 4);		
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 1", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());	
	}
		
	@Test
	public void testSuitePAC20() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", -2, 5, 5);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre -2", -2, (int)pile.depiler());
	}
	
	@Test
	public void testSuitePAC21() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 0, -3, 2);
		assertEquals("La taille de la pile devrait �tre 2", 2, pile.getSize());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());	
	}
	
	@Test
	public void testSuitePAC22() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 0, 5, 3);
		assertEquals("La taille de la pile devrait �tre 3", 3, pile.getSize());
		assertEquals("La valeur [3] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 0", 0, (int)pile.depiler());	
	}
	
	@Test
	public void testSuitePAC23() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 4, -3, 4);
		assertEquals("La taille de la pile devrait �tre 4", 4, pile.getSize());
		assertEquals("La valeur [4] devrait �tre 3", 3, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre -1", -1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre -3", -3, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());	
	}
	
	@Test
	public void testSuitePAC24() 
	{
		SuitePImpl suite = new SuitePImpl();
		PileImpl pile = (PileImpl)suite.build("div", 4, 5, 5);
		assertEquals("La taille de la pile devrait �tre 5", 5, pile.getSize());
		assertEquals("La valeur [5] devrait �tre 0", 0, (int)pile.depiler());
		assertEquals("La valeur [4] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [3] devrait �tre 1", 1, (int)pile.depiler());
		assertEquals("La valeur [2] devrait �tre 5", 5, (int)pile.depiler());
		assertEquals("La valeur [1] devrait �tre 4", 4, (int)pile.depiler());	
	}
		
}
