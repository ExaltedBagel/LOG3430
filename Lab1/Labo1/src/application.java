
public class application {

	public static void main(String[] args)
	{
		suiteP add = new suiteP("addition",-2, 5, 6);
		suiteP sub = new suiteP("soustraction", -2, 5, 6);
		suiteP mul = new suiteP("multiplication", -2, 5, 6);
		suiteP div = new suiteP("division", 2, 3, 6);
		
		add.print();
		sub.print();
		mul.print();
		div.print();
	}
}
