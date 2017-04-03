package pile;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Vector;

import org.junit.Test;

import pile.PileImpl;

public class PileImplTest {

	
	/* =================================
	   Tester le rapporteur de la classe
	   ================================= */
	
	@Test
	public void testGetter()
	{
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		PileImpl pile = new PileImpl();
		pile.setItems(vect);
		
		Vector testVect = pile.getItems();
		
		assertEquals("L'item devrait etre 1", 1, testVect.get(0));
		assertEquals("L'item devrait etre 3", 3, testVect.get(1));
	}
	
	
	/* ===================================
	   Tester le constructeur de la classe
	   =================================== */
	
	@Test
	public void testerConstructeur()
	{
		PileImpl pile = new PileImpl();
		
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
	}
	
	
	/* =====================================================================================
	   Tester tous les transformateurs de la classe dans tous les ordres possibles
	   On commence toujours par le constructeur et on permute les transformateurs parmis eux.
	   Au total, on a 24 cas de test car il y a 4 transformateurs.
	   ===================================================================================== */
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur1()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur2()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur3()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
				
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur4()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 1", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur5()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 1", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
				
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());	
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur6()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 1. depiler
		pile.depiler();
		// Pas de test assert car la fonction est supposée lancer une erreur
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
				
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0",0, pile.getItems().size());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
	}
	
	@Test
	public void testTransformateur7()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
				
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
	}
	
	@Test
	public void testTransformateur8()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
				
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur9()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());	
		
		// 1. depiler
		pile.depiler();
		// erreur attendue
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
	}
	
	@Test
	public void testTransformateur10()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());	
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
	}
	
	@Test
	public void testTransformateur11()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
				
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());			
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur12()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
				
		// 1. depiler
		pile.depiler();
		// erreur attendue
	}
	
	@Test
	public void testTransformateur13()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));	
	}
	
	@Test
	public void testTransformateur14()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));	
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur15()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 1. depiler
		pile.depiler();
		// erreur attendue
				
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));		
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur16()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 1. depiler
		pile.depiler();
		// erreur attendue
				
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));		
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
	}
	
	@Test
	public void testTransformateur17()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 2", 2, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
	}
	
	@Test
	public void testTransformateur18()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 2", 2, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(1));		
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur19()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
				
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 1. depiler
		pile.depiler();
		// erreur attendue			
	}
	
	@Test
	public void testTransformateur20()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 3", 3, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(2));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 2", 2, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
				
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());		
	}
	
	@Test
	public void testTransformateur21()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());		
	}
	
	@Test(expected=EmptyStackException.class)
	public void testTransformateur22()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());
		
		// 1. depiler
		pile.depiler();
		//erreur attendue
				
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));			
	}
	
	@Test
	public void testTransformateur23()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 2", 2, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));	
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(1));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());	
	}
	
	@Test
	public void testTransformateur24()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		assertEquals("L'item devrait etre de taille 10", 10, pile.getItems().capacity());
		assertEquals("L'item devrait etre vide", true, pile.getItems().isEmpty());
		
		// 4. setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		assertEquals("L'item devrait etre 3", 3, pile.getItems().get(1));
		
		// 1. depiler
		pile.depiler();
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));
		
		// 3. reset
		pile.reset();
		assertEquals("L'item devrait etre de taille 0", 0, pile.getItems().size());	
		
		// 2. empiler
		pile.empiler(new Integer(1));
		assertEquals("L'item devrait etre de taille 1", 1, pile.getItems().size());
		assertEquals("L'item devrait etre 1", 1, pile.getItems().get(0));	
	}
	
	
	/* ===============================
	   On test les fonctions "other". 
	   =============================== */
	
	@Test
	public void testGetSize()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		
		// setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		
		assertEquals("L'item devrait etre 2", 2, pile.getSize());
	}
	
	@Test
	public void testEstVide()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		
		assertEquals("L'item devrait etre vrai", true, pile.estVide());
		
		// setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		
		assertEquals("L'item devrait etre faux", false, pile.estVide());
	}
	
	// Exécution normale du getHead()
	@Test
	public void testGetHead1()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		
		// setItems
		Vector vect = new Vector();
		vect.add(new Integer(1));
		vect.add(new Integer(3));
		
		pile.setItems(vect);
		
		assertEquals("L'item devrait etre 3", 3, pile.getHead());
	}
	
	// Exécution jettant une errueure de getHEad()
	@Test(expected=EmptyStackException.class)
	public void testGetHead2()
	{
		// constructeur
		PileImpl pile = new PileImpl();
		
		pile.getHead();
		// erreur attendue
	}
	
}