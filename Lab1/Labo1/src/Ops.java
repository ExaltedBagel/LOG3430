
public class Ops {

	public static void add(int x, int y, suiteP pile)
	{
		// Code pris dans les directives du tp 1
		int result = x;
		if (y > 0) {
			while(y-- != 0) {
				result++;
			}
		}
		else if (y < 0) {
			while(y++ != 0) {
				result--;
			}
		}
		pile.empiler(new Integer(result));
	}
	
	public static void sub(int x, int y, suiteP pile)
	{
		// Code pris dans les directives du tp 1
		int result = x;
		if (y > 0) {
			while(y-- != 0) {
				result--;
			}
		}
		else if (y < 0) {
			while(y++ != 0) {
				result++;
			}
		}
		pile.empiler(new Integer(result));
	}
	
	public static void mult(int x, int y, suiteP pile)
	{
		int result = 0;
		
		if(x > 0 && y > 0)
		{
			while(x-- != 0)
			{
				int tempY = y;
				while(tempY-- != 0)
				{
					result++;
				}
			}
		}
		
		else if(x < 0 && y <0)
		{
			while(x++ != 0)
			{
				int tempY = y;
				while(tempY++ != 0)
				{
					result++;
				}
			}
		}
		
		else if(x > 0 && y < 0)
		{
			while(x-- != 0)
			{
				int tempY = y;
				while(tempY++ != 0)
				{
					result--;
				}
			}
		}
		
		else if(x < 0 && y > 0)
		{
			while(x++ != 0)
			{
				int tempY = y;
				while(tempY-- != 0)
				{
					result--;
				}
			}
		}
		
		pile.empiler(new Integer(result));
	}
	
	public static void div(int x, int y, suiteP pile)
	{	
		int iters = 0;
		
		if(x > 0 && y > 0)
		{
			int tempX = x;
			while(x >= 0)
			{
				iters++;
				tempX = x;
				int tempY = y;
				while(tempY-- != 0)
				{
					x--;
				}
			}
			iters--;
		}
		
		else if(x < 0 && y < 0)
		{
			int tempX = x;
			while(x <= 0)
			{
				iters++;
				int tempY = y;
				while(tempY++ != 0)
				{
					x++;
				}
			}
			iters--;
		}
		
		else if(x < 0 && y > 0)
		{
			while(x <= 0)
			{
				iters--;
				int tempY = y;
				while(tempY-- != 0)
				{
					x++;
				}
			}
			iters++;
		}
		
		else if(x > 0 && y < 0)
		{
			while(x > 0)
			{
				iters--;
				int tempY = y;
				while(tempY++ != 0)
				{
					x--;
				}
			}
			iters++;
		}
		else if(y == 0)
		{
			System.out.println("Dvision par 0");	
		}
		
		pile.empiler(new Integer(iters));
		
	}
}
