public interface Pile {
	
	//Empile un nouvel objet à la pile
	public Object empiler(Object item);
	
	//Dépile et retourne l'object sur la tête.
	public Object depiler();
	
	//Retourne la tête de la pile
	public Object getHead();
	
	//Retourne si la liste contient un objet
	public boolean estVide();
	
	//Retourne la taille
	public int getSize();
	
	//Remet à 0 la pile.
	public void reset();
	
	// Imprime les noeuds
	public void print();
	
	//Classe représentant une valeur de la pile
	class Noeud
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
