
public class suiteP implements IsuiteP
{
	//
	Noeud tete;
	int taille;
	int tailleMax;
	Ops ops;
	
	//Constructeur de la suite
	public suiteP(String op, int valP, int valI, int tailleMax)
	{
		tete = null;
		taille = 0;
		ops = new Ops();
		
		//V�rifie si la suite est l�gale
		if(tailleMax > 10 || tailleMax <2)
			System.out.println("Taille maximale ill�gale, doit �tre entre 2 et 10 inclusif");
		else if(valI % 2 == 0)
			System.out.println("Le troisi�me param�tre doit �tre impaire");
		else if(valP % 2 != 0)
			System.out.println("Le deuxi�me param�tre doit �tre pair");
		else if(op.compareTo("addition") != 0 && op.compareTo("soustraction") != 0 
				&& op.compareTo("multiplication") != 0 && op.compareTo("division") != 0)
			System.out.println("Seules les op�rations 'addition', 'soustraction', 'multiplication' et 'division' sont permises");
		//Op�ration est l�gale
		else
		{
			this.tailleMax = tailleMax;
			
			//On r�gle les premi�res valeurs de la pile
			empiler(valP);

			empiler(valI);
			
			//On applique les op�rations � la pile pour continuer de la garnir.
			if(op.compareTo("addition") == 0)
			{
				while(taille < tailleMax)
					empiler(ops.add((int)tete.getNext().getVal(), (int)tete.getVal()));
					
			}
			else if(op.compareTo("soustraction") == 0)
			{
				while(taille < tailleMax)
					empiler(ops.sub((int)tete.getNext().getVal(), (int)tete.getVal()));
			}
			else if(op.compareTo("multiplication") == 0)
			{
				while(taille < tailleMax)
					empiler(ops.mult((int)tete.getNext().getVal(), (int)tete.getVal()));
			}
			else if (op.compareTo("division") == 0)
			{
				while(taille < tailleMax)
					empiler(ops.div((int)tete.getNext().getVal(), (int)tete.getVal()));
			}
		}
	}
	
	//Empile un nouvel objet � la pile
	public Object empiler(Object item)
	{
		if(taille < tailleMax)
		{
			//On cr�e un nouveau noeud et on le met au sommet de la pile
			Noeud nouv = new Noeud(item);
			nouv.setNext(tete);
			tete = nouv;
			taille++;
		}
		else
		{
			System.out.println("La pile est d�j� pleine!");
			return null;
		}
		
		return item;
	}
	
	
	//D�pile et retourne l'object sur la t�te.
	public Object depiler()
	{
		//On r�cup�re la t�te
		Noeud noeudTete = tete;
		//On assigne le prochain objet � la t�te
		tete = tete.getNext();
		taille--;
		
		return noeudTete.getVal();
	}
	
	//Retourne la t�te de la pile
	public Object getHead()
	{
		return tete.getVal();
	}
	
	//Retourne si la liste contient un objet
	public boolean estVide()
	{
		return taille == 0;
	}
	
	//Retourne la taille
	public int getSize()
	{
		return taille;
	}
	
	//Remet � 0 la pile.
	public void reset()
	{
		tete = null;
		taille = 0;
	}
	
	// Imprime les noeuds
	public void print()
	{
		System.out.println("Etat de la pile:");
		Noeud tempTete = tete;
		while(tete != null)
		{
			System.out.println(tete.getVal());
			tete = tete.getNext();
		}
		System.out.println();
		tete = tempTete;
	}
	
	//Classe repr�sentant une valeur de la pile
	private class Noeud
	{
		Object valeur;
		Noeud prochainNoeud;
		
		public Noeud(Object val)
		{
			valeur = val;
			prochainNoeud = null;
		}
		
		public Object getVal()
		{
			return valeur;
		}
		
		public void setVal(Object item)
		{
			valeur = item;
		}
		
		public void setNext(Noeud proch)
		{
			prochainNoeud = proch;
		}
		
		public Noeud getNext()
		{
			return prochainNoeud;
		}
	}
	
}
