package home;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import operations.Calculator;
import operations.CalculatorImpl;
import pile.Pile;
import pile.PileImpl;

public class SuitePImplTest {
	
	
	/*
	 *  Tests d'int�gration: Niveau 1
	 */
	
	// Il n'a que des classes abstraites dans le niveau 1 alors il n'y a rien � tester. 
	// Nous avons gard� cette section pour maintenir l'order des niveaux de tests.
	
	/*
	 *  Tests d'int�gration: Niveau 2
	 */
	
	// Test la classe PileImpl
	
	//On test le constructeur
	@Test
	public void testConstructeur()
	{
		//La pile nouvellement cr��e est vide.
		PileImpl pile = new PileImpl();
		assertEquals("La pile devrait �tre vide", true, pile.estVide());
	}
	
	//On test la fonction estVide
	@Test
	public void testEstVide()
	{
		//La pile nouvellement cr��e est vide.
		PileImpl pile = new PileImpl();
		assertEquals("La pile devrait �tre vide", true, pile.estVide());
	}
	
	//On test pour voir si la taille de la pile change ad�quatement
	@Test
	public void testGetSize()
	{
		PileImpl pile = new PileImpl();
		
		//On empile une valeur pour avoir une taille de 1
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre 1", 1, pile.getSize());
	}

	//On test le d�piler dans la situation o� il g�n�re une erreur
	@Test(expected=EmptyStackException.class)
	public void testDepiler()
	{
		Pile pile = new PileImpl();
		//D�piler cr��e une erreur car elle est vide.
		pile.depiler();
	}
	
	//On test de r�cup�rer la valeur sur le sommet de la pile.
	@Test
	public void testGetHead()
	{
		PileImpl pile = new PileImpl();
		
		//Empiler met la valeur 1 sur la t�te
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre 1", 1, pile.getHead());
	}
	
	//On test la methode empiler pour empiler deux objets
	@Test
	public void testEmpiler()
	{
		PileImpl pile = new PileImpl();
		
		//Empiler met la valeur 1 sur la t�te
		pile.empiler(new Integer(1));
		pile.empiler(new Integer(2));
		assertEquals("L'item devrait etre 2", 2, pile.getHead());
		assertEquals("La taille devrait etre 2", 2, pile.getSize());
	}
	
	//On test la methode reset qui remet le vecteur vide
	@Test
	public void testReset()
	{
		//On empile un �l�ment et on s'assure que le reset rend vide
		PileImpl pile = new PileImpl();
		pile.empiler(new Integer(1));

		//Reset devrait vider
		pile.reset();
		assertEquals("La pile devrait �tre vide", true, pile.estVide());
	}
	
	
	// Test la classe CalculatorImpl
	
	
	// Test la m�thode de multiplication. 
	@Test
	public void testMultiply()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 6", 6, calc.multiply(2, 3));
	}
	
	// Test la m�thode de division
	@Test
	public void testDivide()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 4", 4, calc.divide(8, 2));
	}
	
	// Test la m�thode d'addition
	@Test
	public void testAdd()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 10", 10, calc.add(8, 2));
	}
	
	// Test la m�thode de soustraction
	@Test
	public void testSubtract()
	{
		Calculator calc = new CalculatorImpl();
		
		assertEquals("L'item devrait etre 6", 6, calc.substract(8, 2));
	}
	
	
	
	/*
	 *  Tests d'int�gration: Niveau 3
	 */
	
	// Test la classe SuitePImpl
	
	// Test la m�thode build avec l'op�ration "add"
	@Test
	public void testBuild() {

		SuitePImpl suiteP = new SuitePImpl();
		Pile pile = suiteP.build("add", 2, 3, 3);
		
		assertEquals("L'item devrait etre 5", 5, pile.getHead());
	}
	
	// Test le fait que la pile est vide apr�s l'impression sur la console.
	@Test
	public void testPrint()
	{
		SuitePImpl suiteP = new SuitePImpl();
		Pile pile = suiteP.build("add", 2, 3, 3);
		
		suiteP.printPile(pile);
		
		assertEquals("L'item devrait etre 0", 0, pile.getSize());
	}

}
