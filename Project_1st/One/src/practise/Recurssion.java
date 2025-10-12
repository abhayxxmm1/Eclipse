package practise;

import java.util.Iterator;

public class Recurssion {

	public static void main(String[] args) {
		
		hi(2);
		
	}
	
	public static Object hi(int n)
	{
		for (int i = 0; i < n-1; i++) {
			
			System.out.println("hi");
		}
		
		return hi(n);
	}
}
