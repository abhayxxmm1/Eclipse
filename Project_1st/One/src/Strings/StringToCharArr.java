package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class StringToCharArr {

	public static void main(String[] args) {
		
		String s = "cwef@R#$^%$UHCXV";
		char [] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			
			ch[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}
}
