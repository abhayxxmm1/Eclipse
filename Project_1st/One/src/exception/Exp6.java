package exception;

public class Exp6 {
	/**
	 * You only need to include a throws clause on a method if the method throws 
	 * a checked exception example:- I/OExecption. 
	 * If the method throws a runtime exception then there is no need to do so.
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException{
		for(int i=0; i<10; i++ )
		{
			System.out.println("sir is intelligent");
			
			Thread.sleep(500);	// https://www.google.com/search?client=safari&rls=en&q=work+of+thread.sleep+in+java&ie=UTF-8&oe=UTF-8
		}
	}
}
