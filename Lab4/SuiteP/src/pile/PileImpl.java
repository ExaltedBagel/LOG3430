package pile;

import java.util.EmptyStackException;
import java.util.Vector;
/**
 * @class			: PileImpl
 * @interface		: Pile
 * @author	 		: Ons mlouki
 * 					  Ons.mlouki@gmail.com
 * 					  
 * 
 * @summary			: based on "external reference" 
 */
public class PileImpl implements Pile{
	
	 private Vector items;
	 
	 public PileImpl(){items = new Vector(10);}

	@Override
	public Object empiler(Object item) {
		// TODO Auto-generated method stub
		items.addElement(item);
	    return item;
	}

	@Override
	public Object depiler() {
		// TODO Auto-generated method stub
		int len = items.size();
	    Object item = null;
	    if (len == 0)
	      throw new EmptyStackException();
	    item = items.elementAt(len - 1);
	    items.removeElementAt(len - 1);
	    return item;
	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		 return (items.size() == 0);
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
	    items = null;items = new Vector(10);
	}

	@Override
	public Object getHead() {
		// TODO Auto-generated method stub
		int len = items.size();
	    if (len == 0)
	      throw new EmptyStackException();
	   return items.elementAt(len - 1);
	}   
}
