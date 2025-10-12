package practise;

import java.util.Iterator;

public class Pattern {

	public static void main(String[] args) {
		
		p1(5);
		System.out.println();
		p2(11);
		
		System.out.println();
		p3(11);
		
		System.out.println();
		System.out.println();
		
		rightA(11);
		
		System.out.println();
		ro(11);
		
		System.out.println();
		revHalf(11);
	}
	
	public static void p1(int n)
	{
		for (int i = 0; i < n; i++) {/// outer
			
			for (int j = 0; j < n; j++) {

				System.out.print("*"+ " "); // inner == x axis
			}
			System.out.println();	// outer == y axis / vertical
		}
		
	}
	
	public static void p2(int n)
	{
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
			
				if (i==j || i==(n-1)/2 || j==(n-1)/2 ||
						i+j==n-1 && j<n/2 ) {
					
					System.out.print("*"+ " ");
				}
				else {
					
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void p3(int n)
	{
		for (int i = 0; i < n; i++) {/// outer
			
			for (int j = 0; j < n; j++) {

				if (i==0 && j>n/2 || i==n-1 && j<n/2 || j==n/2 || i==n/2
						|| j==n-1 && i>n/2 || j==0 && i<n/2
						|| i==j || i+j==n-1) {
					
					System.out.print("*"+ " "); // inner == x axis
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();	// outer == y axis / vertical
		}
		
	}
	
	public static void rightA(int n)
	{
	
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if ( i==0 || i==n-1 || j==0
						|| j==n-1 || i==n/4  || j==n/2 && i<3*n/4 
						|| i==n/2 && j<3*n/4 && j>n/4 || i==3*n/4 && j<3*n/4 && j>n/4
						|| (j==n/4 || j==3*n/4 ) && i>n/2 && i<3*n/4 
						|| (j==n/4 || j==3*n/4 ) && i<n/4
						
						) {
					
					System.out.print("*"+ " "); // inner == x axis
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ro(int n)
	{
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if ( i==0 || i==n-1 || j==0
						|| j==n-1 || j==n/2 && i<3*n/4 && i>n/2 
						|| i==n/2 && j<3*n/4 && j>n/4 || i==3*n/4 && j<3*n/4 && j>n/4
						|| (j==n/4 || j==3*n/4 ) && i>n/2 && i<3*n/4 
						|| (j==n/4 || j==3*n/4 ) && i<n/4
						
						) {
					
					System.out.print("*"+ " "); // inner == x axis
				}
				else {
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void revHalf(int n)
	{
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (j+i<n-1) {	// j<n-1-i

					System.out.print("  "); // jugad if single space
				}
				else {
					System.out.print("*"+" ");
					
				}
			}
			System.out.println();
		}
	}
	
	public static void uperHalf(int n)
	{
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
			}
		}
	}
}
