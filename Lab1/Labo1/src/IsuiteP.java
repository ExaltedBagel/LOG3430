
public interface IsuiteP {
	
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
}
