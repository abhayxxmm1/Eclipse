package Strings;

import java.util.Arrays;

public class permutation {

	public static void main(String[] args) {
		
		String string = "1234567890";
		
		char[] arr = string.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		createPermutation(arr, 0);
		
	}
	
	public static void createPermutation(char [] ch,int fix) {
		
		if (fix==ch.length-1) {
			
			System.out.println(new String(ch));
			
			return;
		}
		
		for (int i = fix; i < ch.length; i++) {
			
			swap(ch, fix, i);
			createPermutation(ch, fix+1);
			swap(ch, i, fix);
			
			System.out.println(i);
		}
	}
	
	public static void swap(char [] ch,int a,int b)
	{
		
		char  temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
	}
}
