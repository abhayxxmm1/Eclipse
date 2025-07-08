package abstraction;

public class CalculatorImp extends Calculator{
	public void addition(int x, int y)
	{
		int res = x+y;
		System.out.println(res);
	}
	
	public void subtraction(int b,int z)
	{
		int res = b - z;
		System.out.println(res);
	}
	
	public void multiplication(int m, int b)
	{
		int res = m * b;
		System.out.println(res);
	}
}
