package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class LowerToUpperCase {

	public static void main(String[] args) {
		String s = "asfqefWETERHRTRTUTfRTJYTU%WQREWT$^$%*%^%";
		String cc = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch<='z' && ch>='a') {
				
				cc = cc + (char)(ch-32); /// converting to lower by
				/// Subtracting 32 according to ASCII
			}
			else {
				cc = cc + ch;
			}
		}
		
		
		System.out.println(cc);
		System.out.println(UpperToLower(cc));
		System.out.println(Arrays.toString(halfUpperHalfLower(s)));
	}
	
	public static String UpperToLower(String a)
	{
		String res = "";
		
		for (int i = 0; i < a.length(); i++) {
			
			char ch = a.charAt(i);
			
			/** Constraining the range for segregating the string*/
			if (ch<='Z' && ch>='A') {
				
				res = res + (char)(ch+32);	/// converting to lower by
				/// adding 32 according to ASCII 
			}
			else {
				
				res = res + ch;
			}
		}
		return res;
	}
	
	public static char [] halfUpperHalfLower(String s)
	{
		String string = "";
		char [] ck = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch<='z' && ch>='a') {
				
				ck[i] = ch;	// converting to array
			}
		}
		
		
		int i=0,j=ck.length-1;
		while(i<j)
		{
			while(ck[i]<='Z'&&ck[i]>='A')
			{
				i++;
			}
			while (ck[j]<='z' && ck[j]>='a') 
			{
				j--;
			}
			if (i<j) {
				char temp = ck[i];
				ck[i] = ck[j];
				ck[j] = temp;
				i++;
				j--;
			} 
		}
		return ck;
	}
	
	
	
	public static String alternate(String s)
	{
		
	}
	
	
	
	
	
	
	
	
	
}
