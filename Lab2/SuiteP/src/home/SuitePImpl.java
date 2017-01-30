package home;
/**
 * @class			: SuitePImpl
 * @interface		: SuiteP
 * @author	 		: Ons mlouki
 * 					  Ons.mlouki@gmail.com
 * 	
 */

import operations.Calculator;
import operations.CalculatorImpl;
import pile.Pile;
import pile.PileImpl;

public class SuitePImpl implements SuiteP{
	
public Pile build(String op,int valP, int valI,int tailleMax){
	
	Pile pile = new PileImpl();	
				
		if (tailleMax>=10)
		{
			System.out.println("taille chaine doit etre inferieur/egal a 10");
			return pile;
		}
		
		if ((valP%2)!=0)
		{
			System.out.println("deuxieme parametre de suiteP doit etre paire");
			return pile;
		}
		
		if ((valI%2)==0)
		{
			System.out.println("deuxieme parametre de suiteP doit etre impaire");
			return pile;
		}
		
		Calculator myCalculator= new CalculatorImpl();
		 if(tailleMax>=1){
			 pile.empiler(valP);
			   }
		 if(tailleMax>=2){
			 pile.empiler(valI);
		 }
		 tailleMax--;
		 int i=1;
		 tailleMax--;
		 
		switch (op){
		   case "add":while(tailleMax>0){
			   Object val2tmp=pile.dépiler();
			   Object val1tmp=pile.dépiler();
			   pile.empiler(val1tmp);
			   pile.empiler(val2tmp);
			   pile.empiler(myCalculator.add((int)val1tmp,(int)val2tmp));
			   i++;
			   tailleMax--;
			   };
		   break;
		   case "mult":while(tailleMax>0){
			   Object val2tmp=pile.dépiler();
			   Object val1tmp=pile.dépiler();
			   pile.empiler(val1tmp);
			   pile.empiler(val2tmp);
			   pile.empiler(myCalculator.multiply((int)val1tmp,(int)val2tmp));
			   i++;
			   tailleMax--;
			   };
		   break;
		   case "soust":while(tailleMax>0){
			   Object val2tmp=pile.dépiler();
			   Object val1tmp=pile.dépiler();
			   pile.empiler(val1tmp);
			   pile.empiler(val2tmp);
			   pile.empiler(myCalculator.substract((int)val1tmp,(int)val2tmp));
			   i++;
			   tailleMax--;
			   };
		   break;
		   case "div":while(tailleMax>0){
			   Object val2tmp=pile.dépiler();
			   Object val1tmp=pile.dépiler();
			   pile.empiler(val1tmp);
			   pile.empiler(val2tmp);
			   try{
				   pile.empiler(myCalculator.divide((int)val1tmp,(int)val2tmp));
			   }catch(ArithmeticException e){
				   System.out.print( "Pile:"); printPile(pile);
				   System.out.println( "\nle reste de la pile ne peut etre calculer a cause de la division par zero");
					return pile;
			   }
			   i++;
			   tailleMax--;
			   };
		   break;
		   default:System.out.println("operateur "+op+" non identifié");
			   break;
		}
		
		System.out.print( "Pile:"); printPile(pile);
		return pile;
		
}

public void printPile(Pile pile){
	StringBuilder chaineContent=new StringBuilder();
	while(pile.getSize()!=0){
		chaineContent.insert(0, pile.dépiler()+" ");
	}
	System.out.print( chaineContent.toString());
}

}