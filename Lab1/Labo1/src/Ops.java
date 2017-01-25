
public class Ops implements IOps {

	public int add(int x, int y)
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
		
		if(x > 0 && y > 0 && result < 0)
			throw new ArithmeticException();
		
		if(x < 0 && y < 0 && result > 0)
			throw new ArithmeticException();
		
		return result;
	}
	
	public int sub(int x, int y)
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
		
		if(x > 0 && y < 0 && result < 0)
			throw new ArithmeticException();
		
		if(x < 0 && y > 0 && result > 0)
			throw new ArithmeticException();
		
		return result;
	}
	
	public int mult(int x, int y)
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
		
		
		if(x > 0 && y > 0 && result < 0)
			throw new ArithmeticException();
		
		if(x < 0 && y < 0 && result < 0)
			throw new ArithmeticException();
		
		if(x > 0 && y < 0 && result > 0)
			throw new ArithmeticException();
		
		if(x < 0 && y > 0 && result > 0)
			throw new ArithmeticException();
		
		return result;
	}
	
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
