package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp3 {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int num = sc.nextInt();
			
			System.out.println("Enter the denominator");
			int den = sc.nextInt();
			
			int ans = num/den;
		} 
//		catch (Exception e) { 	// ❌ Wrong order
//			
//		}
		catch (ArithmeticException e) {
			System.out.println("donot divide with zero!");
		}
		catch (InputMismatchException e) {
			System.out.println("Give a valid input");
		}
		catch (ClassCastException e) {
			System.out.println("dont call member object with null refernce");
		}
		catch (Exception e) {		// ✅ Right order
			System.out.println("Exception is handled");
		}
		finally {
			System.err.println("when will the control goes to finally block ？");
			System.out.println("1) when the exception never occurs");
			System.out.println("2) when an exception occurs a& it's handled");
			System.out.println("3) Exception occurs but not handled (reference not caught sucessfully)");
			System.out.println("4) Exception occurs in the try block but no catching mechanism");
		}
	}

}
