package Strings;

import java.util.Arrays;

import javax.xml.stream.events.StartDocument;

import com.apple.laf.resources.aqua;

public class Sort {

	public static void main(String[] args) {
		
		String g = "jhgutfqwfasdqwgdfdskj sdknmmmmmmm";
		
		System.out.println(Arrays.toString(sortStr(g)));
		
		System.out.println(strToArr(Arrays.toString(strToArr(g))));
		
		
		char []ms = strToArr(g); 
	}
	
	public static char[] sortStr(String s) {
		
		/**
		 * the built-in method avoids bugs, is more readable, and leverages JVM optimizations
		 * both of them have O(n) complexity
		 * */
		char nw [] = strToArr(s); /// this is how we use our own method
//		char nw [] = s.toCharArray(); // built-in
		
		/** Bubble sort*/
		for (int i = 0; i < nw.length - 1; i++) {
			
			for (int j = 0; j < nw.length - i -1; j++) {
				
				if (nw[j] > nw[j+1]) {
					
					char temp = nw[j+1];
					nw[j+1] = nw[j];
					nw[j] = temp;
				}
			}
		}
		
		return nw;
		
		
	}
	
	public static char[] strToArr(String s)
	{
		char nw [] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			
			nw[i] = s.charAt(i);
		}
		
		return nw;
	}
	
	
	
	public static char[] mergeSortStr(char []a, char start,char end)
	{
		if (start<end) {
			int mid= (start+end)/2; 
		}
	}
	
	public static void merge(char[] a, char start, char mid, char end) {
		
		char ans[] = new char[a.length];
		int i=start,  j= mid+1, k=start;
		
		/// check if start is less than mid and end is greater than mid 
		while (i <= mid && j <= end) { 
			
			/// 
			if (a[i] > a[j]) {
				
				ans[k++] = a[j++];
			}
			else if (a[i] <= a[j]) {
				
				ans[k++] = a[i++];
			}
		}
		
		while (i <= mid) {
			
			ans[k++] = a[j++];
		}
		
		while (j <= end) {
			
			ans[k++] = a[i++];
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
