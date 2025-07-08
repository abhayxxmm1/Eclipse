package abstraction;

public class CalculatorDriver {

	public static void main(String[] args) 
	{
		Calculator c1 = new CalculatorImp();
		
		c1.addition(10, 20);
		c1.multiplication(30, 40);
	}

}
