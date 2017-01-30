
public class application {

	public static void main(String[] args)
	{
		suiteP add = new suiteP("addition",Integer.MAX_VALUE-1, 5, 6);
		suiteP sub = new suiteP("soustraction", Integer.MAX_VALUE-1, -5, 6);
		suiteP mul = new suiteP("multiplication", Integer.MAX_VALUE-1, -5, 6);
		suiteP div = new suiteP("division", 2, 3, 6);
		
		add.print();
		sub.print();
		mul.print();
		div.print();
	}
}
