
public interface IsuiteP {
	
	//Empile un nouvel objet � la pile
	public Object empiler(Object item);
	
	//D�pile et retourne l'object sur la t�te.
	public Object depiler();
	
	//Retourne la t�te de la pile
	public Object getHead();
	
	//Retourne si la liste contient un objet
	public boolean estVide();
	
	//Retourne la taille
	public int getSize();
	
	//Remet � 0 la pile.
	public void reset();
	
	// Imprime les noeuds
	public void print();
}
