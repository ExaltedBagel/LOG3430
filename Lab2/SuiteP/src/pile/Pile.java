package pile;

public interface Pile{
	public Object getHead();
    public Object empiler(Object item);
    public Object depiler();
    public boolean estVide();
    public int getSize();
    public void reset();
}
