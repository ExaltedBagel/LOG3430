package pile;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import pile.PileImpl;

public class PileImplTest {

	@Test
	public void testEtat0Empiler() 
	{
		PileImpl pile = new PileImpl(); 
				
		assertEquals("L'item devrait devrait etre 1", 1, pile.empiler(1));
		assertEquals("La taille de la pile devrait etre 1", 1, pile.getSize());	
	}
	
	@Test(expected=EmptyStackException.class)
	public void testEtat0Depiler() 
	{
		PileImpl pile = new PileImpl(); 
		pile.depiler();		
	}
	
	@Test
	public void testEtat0Size() 
	{
		PileImpl pile = new PileImpl(); 
		assertEquals("La taille de la pile devrait etre 0", 0, pile.getSize());
	}
	
	@Test
	public void testEtat0Reset() 
	{
		PileImpl pile = new PileImpl(); 
		pile.reset();
		assertEquals("La taille de la pile devrait etre 0", 0, pile.getSize());
	}
	
	@Test(expected=EmptyStackException.class)
	public void testEtat0GetHead() 
	{
		PileImpl pile = new PileImpl(); 
		pile.getHead();
	}
	
	@Test
	public void testEtat0EstVide() 
	{
		PileImpl pile = new PileImpl(); 
		assertEquals("La taille de la pile devrait etre vide", true, pile.estVide());
	}
	
	//Etat 1
	
	@Test
	public void testEtat1Empiler() 
	{
		PileImpl pile = new PileImpl();
		//On atteint l'etat desire
		pile.empiler(1);
		
		assertEquals("L'item devrait devrait etre 2", 2, pile.empiler(2));
		assertEquals("La taille de la pile devrait etre 2", 2, pile.getSize());	
	}
	
	@Test
	public void testEtat1Depiler() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		
		assertEquals("L'item devrait devrait etre 1", 1, pile.depiler());		
		assertEquals("La taille de la pile devrait etre 0", 0, pile.getSize());	
	}
	
	@Test
	public void testEtat1Size() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		
		assertEquals("La taille de la pile devrait etre 1", 1, pile.getSize());
	}
	
	@Test
	public void testEtat1Reset() 
	{
		PileImpl pile = new PileImpl(); 		
		//On atteint l'etat desire
		pile.empiler(1);
		
		pile.reset();
		assertEquals("La taille de la pile devrait etre 0", 0, pile.getSize());
	}
	
	@Test
	public void testEtat1GetHead() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		
		assertEquals("La tête de la pile devrait etre 1", 1, pile.getHead());
	}
	
	@Test
	public void testEtat1EstVide() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		
		assertEquals("La taille de la pile ne devrait pas etre vide", false, pile.estVide());
	}
	
	//Etat 2
	
	@Test
	public void testEtat2Empiler() 
	{
		PileImpl pile = new PileImpl();
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		assertEquals("L'item devrait devrait etre 4", 4, pile.empiler(4));
		assertTrue("La taille de la pile devrait etre au moins de 2", 2 <= pile.getSize());	
	}
	
	@Test
	public void testEtat2Depiler1() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		assertEquals("L'item devrait devrait etre 2", 2, pile.depiler());		
		assertEquals("La taille de la pile devrait etre 1", 1, pile.getSize());	
	}
	
	@Test
	public void testEtat2Depiler2() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		pile.empiler(3);
		
		assertEquals("L'item devrait devrait etre 3", 3, pile.depiler());		
		assertTrue("La taille de la pile devrait etre au moins de 2", 2 <= pile.getSize());	
	}
	
	@Test
	public void testEtat2Size() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		assertTrue("La taille de la pile devrait etre au moins de 2", 2 <= pile.getSize());	
	}
	
	@Test
	public void testEtat2Reset() 
	{
		PileImpl pile = new PileImpl(); 		
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		pile.reset();
		assertEquals("La taille de la pile devrait etre 0", 0, pile.getSize());
	}
	
	@Test
	public void testEtat2GetHead() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		assertEquals("La tête de la pile devrait etre 2", 2, pile.getHead());
	}
	
	@Test
	public void testEtat2EstVide() 
	{
		PileImpl pile = new PileImpl(); 
		//On atteint l'etat desire
		pile.empiler(1);
		pile.empiler(2);
		
		assertEquals("La taille de la pile ne devrait pas etre vide", false, pile.estVide());
	}
}