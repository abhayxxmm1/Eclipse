package exception;

public class Exp4 {
	public static void main(String[] args) {
		
	
	
		
		try
		{
			test();	// exception handled in callig method
		}
		catch (ArithmeticException e)
		{
			System.out.println("dont divide by 0");
		}
	}
	public static void test()
		{
			try {
				System.out.println(10/0);
			} catch (Exception e) {
				System.out.println("hello");
			}
			System.out.println(10/0);
		}
}