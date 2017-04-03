package pile;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Vector;

import org.junit.Test;

import pile.PileImpl;

public class PileImplTest {

	//On test le constructeur
	@Test
	public void testConstructeur()
	{
		//La pile nouvellement créée est vide.
		PileImpl pile = new PileImpl();
		assertEquals("La pile devrait être vide", true, pile.estVide());
	}
	
	//On test la fonction estVide
	@Test
	public void testEstVide()
	{
		//La pile nouvellement créée est vide.
		PileImpl pile = new PileImpl();
		assertEquals("La pile devrait être vide", true, pile.estVide());
	}
	
	//On test pour voir si la taille de la pile change adéquatement
	@Test
	public void testGetSize()
	{
		PileImpl pile = new PileImpl();
		
		//On empile une valeur pour avoir une taille de 1
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre 1", 1, pile.getSize());
	}

	//On test le dépiler dans la situation où il génère une erreur
	@Test(expected=EmptyStackException.class)
	public void testDepiler()
	{
		Pile pile = new PileImpl();
		//Dépiler créée une erreur car elle est vide.
		pile.depiler();
	}
	
	//On test de récupérer la valeur sur le sommet de la pile.
	@Test
	public void testGetHead()
	{
		PileImpl pile = new PileImpl();
		
		//Empiler met la valeur 1 sur la tête
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre 1", 1, pile.getHead());
	}
	
	//On test la methode empiler pour empiler deux objets
	@Test
	public void testEmpiler()
	{
		PileImpl pile = new PileImpl();
		
		//Empiler met la valeur 1 sur la tête
		pile.empiler(new Integer(1));
		pile.empiler(new Integer(2));
		assertEquals("L'item devrait etre 2", 2, pile.getHead());
		assertEquals("La taille devrait etre 2", 2, pile.getSize());
	}
	
	//On test la methode reset qui remet le vecteur vide
	@Test
	public void testReset()
	{
		//On empile un élément et on s'assure que le reset rend vide
		PileImpl pile = new PileImpl();
		pile.empiler(new Integer(1));

		//Reset devrait vider
		pile.reset();
		assertEquals("La pile devrait être vide", true, pile.estVide());
	}	
}