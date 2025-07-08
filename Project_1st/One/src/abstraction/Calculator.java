package abstraction;

public abstract class Calculator {
	public abstract void addition(int a, int b);

	public abstract void subtraction(int a, int b);
	
	public void divide(double a, double b)
	{
		double res = a/b;
		System.out.println(res);
	}
	
	abstract public void multiplication(int a, int b);
}
