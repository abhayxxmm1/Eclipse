package exception;

import java.util.Scanner;

public class Exp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the numarator");
		int num = sc.nextInt();
		
		System.out.println("Enter the Denominator");
		int den =  sc.nextInt();
		
		try {
			 int ans =  num/ den;
			 System.out.println(ans);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("do-not divide by zero!");
		}
				
	}
}
