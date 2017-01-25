
public class Ops implements IOps {

	// Addition de 2 entiers avec détection d'erreurs
	public int add(int x, int y)
	{
		
		// Code pris dans les directives du tp 1
		int result = x;
		int temY = y;
		if (y > 0) {
			while(temY-- != 0) {
				result++;
			}
		}
		else if (y < 0) {
			while(temY++ != 0) {
				result--;
			}
		}
		
		if(x > 0 && y > 0 && result < 0)
			throw new ArithmeticException();
		
		if(x < 0 && y < 0 && result > 0)
			throw new ArithmeticException();

		return result;
	}
	
	// Soustraction de 2 entiers avec détection d'erreurs
	public int sub(int x, int y)
	{
		// Code pris dans les directives du tp 1
		int result = x;
		int tempY = y;
		if (y > 0) {
			while(tempY-- != 0) {
				result--;
			}
		}
		else if (y < 0) {
			while(tempY++ != 0) {
				result++;
			}
		}
		
		if(x > 0 && y < 0 && result < 0)
			throw new ArithmeticException();
		
		if(x < 0 && y > 0 && result > 0)
			throw new ArithmeticException();
		
		return result;
	}
	
	// Multiplication de 2 entiers avec détection d'erreurs
	public int mult(int x, int y)
	{
		int result = 0;
		int tempX = x;
		if(x > 0 && y > 0)
		{
			while(tempX-- != 0)
			{
				int tempY = y;
				while(tempY-- != 0)
				{
					result++;
				}
				if(result < 0)
					throw new ArithmeticException();
			}
		}
		
		else if(x < 0 && y < 0)
		{
			while(tempX++ != 0)
			{
				int tempY = y;
				while(tempY++ != 0)
				{
					result++;
				}
				if(result < 0)
					throw new ArithmeticException();
			}
		}
		
		else if(x > 0 && y < 0)
		{
			while(tempX-- != 0)
			{
				int tempY = y;
				while(tempY++ != 0)
				{
					result--;
				}
				if(result > 0)
					throw new ArithmeticException();
			}
		}
		
		else if(x < 0 && y > 0)
		{
			while(tempX++ != 0)
			{
				int tempY = y;
				while(tempY-- != 0)
				{
					result--;
				}
				if(result > 0)
					throw new ArithmeticException();
			}
		}
		
		return result;
	}
	
	// Division entière de 2 entiers avec détection d'erreurs
	public int div(int x, int y)
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
			throw new ArithmeticException();	
		}
		
		return iters;	
	}
}
