package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp2 {
	public static void main(String[] args) {
		try
		{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numerator");
		int nm = scanner.nextInt();
		
		System.out.println("Enter the denominator");
		int dn = scanner.nextInt();
		
		int ans = nm/dn;
		System.out.println(ans);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("dont divide by zero!");
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("dont call member object with null reference");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Give a valid input");
		}
		System.out.println("Thank You");
		
	}
}
