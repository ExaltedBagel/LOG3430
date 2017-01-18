
public class suiteP
{
	Noeud tete;
	int taille;
	int tailleMax;
	
	//Constructeur de la suite
	public suiteP(String op, int valP, int valI, int tailleMax)
	{
		tete = null;
		taille = 0;
		//Vérifie si la suite est légale
		if(tailleMax > 10 || tailleMax <2)
			System.out.println("Taille maximale illégale, doit être entre 2 et 10 inclusif");
		else if(valI % 2 == 0)
			System.out.println("Le troisième paramètre doit être impaire");
		else if(valP % 2 != 0)
			System.out.println("Le deuxième paramètre doit être pair");
		else if(op.compareTo("addition") != 0 && op.compareTo("soustraction") != 0 
				&& op.compareTo("multiplication") != 0 && op.compareTo("division") != 0)
			System.out.println("Seules les opérations 'addition', 'soustraction', 'multiplication' et 'division' sont permises");
		//Opération est légale
		else
		{
			this.tailleMax = tailleMax;
			
			//On règle les premières valeurs de la pile
			Noeud prem = new Noeud(valP);
			taille++;
			
			Noeud deux = new Noeud(valI);
			deux.setNext(prem);
			taille++;
			
			//On applique les opérations à la pile pour continuer de la garnir.
			if(op.compareTo("addition") == 0)
			{
				
			}
			else if(op.compareTo("soustraction") == 0)
			{
				
			}
			else if(op.compareTo("multiplication") == 0)
			{
				
			}
			else if (op.compareTo("division") == 0)
			{
				
			}
		}
	}
	
	//Empile un nouvel objet à la pile
	public Object empiler(Object item)
	{
		if(taille < tailleMax)
		{
			//On crée un nouveau noeud et on le met au sommet de la pile
			Noeud nouv = new Noeud(item);
			nouv.setNext(tete);
			tete = nouv;
			taille++;
		}
		else
		{
			System.out.println("La pile est déjà pleine!");
			return null;
		}
		
		return item;
	}
	
	
	//Dépile et retourne l'object sur la tête.
	public Object depiler()
	{
		//On récupère la tête
		Noeud noeudTete = tete;
		//On assigne le prochain objet à la tête
		tete = tete.getNext();
		taille--;
		
		return noeudTete.getVal();
	}
	
	//Retourne la tête de la pile
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
	
	//Remet à 0 la pile.
	public void reset()
	{
		tete = null;
		taille = 0;
	}
	
	//Classe représentant une valeur de la pile
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
