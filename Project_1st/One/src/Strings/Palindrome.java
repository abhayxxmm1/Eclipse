package Strings;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "malayalam";
		
		System.out.println(palindrome(s));
	}
	
	/// two pointer method/ approach
	public static boolean palindrome(String s)
	{
		for (int i = 0,j=s.length()-1; i < j; i++,j--) {
			
			if (s.charAt(i)!=s.charAt(j)) {
				
				return false;
			}
		}
		return true;
	}
		
}