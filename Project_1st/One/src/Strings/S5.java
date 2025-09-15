package Strings;

import java.nio.channels.AsynchronousByteChannel;
import java.util.Arrays;

public class S5 {
	public static void main(String[] args) {
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		
		/** to print all the characters of string*/
//		for (int i = 0; i < s.length(); i++) {
//			
//			System.out.println(s.charAt(i));	/** Returns the char value at the specified index.*/
//		}
		
		System.out.println(s.length());
		
		/** tells the character ASCII value at specific point
		 * Returns the character (Unicode code point) at the specified index.*/
		System.out.println(s.codePointAt(2));
		
		/** compares the 2 string using the ASCII values*/
		System.out.println("ABC".compareTo("abc"));
		
		/** converts to its following case and compare the values*/
		System.out.println("ABC".compareToIgnoreCase("abc"));
		
		/** upper case and lower case*/ 
		System.out.println(s.toUpperCase());
		System.out.println("AbC".toLowerCase());
		
		char ch [] = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println("HI".concat("hi"));
		
		System.out.println(s.contains("co")); // directly in string
		System.out.println(s.contains(s)); /// by storing in variable
		
		/** case sensitive*/
		System.out.println(s.startsWith("pneum"));
		System.out.println(s.endsWith("iosis"));
		
		byte []ar = s.getBytes();
		System.out.println(Arrays.toString(ar));
		
		/** gives space at ?*/
		System.out.println(s.indent(3));
		
		/** Returns the index within this string of the first occurrence of the specified character
		 * if the character is not present in the string it returns -1
		 * example of method overloading*/
		System.out.println(s.indexOf('m'));
		System.out.println(s.indexOf('a', 10)); /// checks after the given index
		System.out.println(s.indexOf("icrosc")); /// gives the index from the 1st string character of ip by user
		
		System.out.println("   ".isBlank());
		System.out.println("".isEmpty()); /// considers space too
		
		/** checks from the last index 
		 * gives the index from the 1st string character of ip by user
		 * check it out*/
		System.out.println(s.lastIndexOf("ne"));
		
		System.out.println("a".repeat(100));
		
		System.out.println(s.replace('a', '%')); //
		System.out.println(s.replace("o", "%%%%"));	//
		
		/** splits the String around matches of the given
		 * if " " then around the space
		 * if "a" around the character a
		 * and the characters also gets missing*/
		String s2 = "I love bharat";
		String [] words = s2.split("a");
		System.out.println(Arrays.toString(words));
		
		/** white space remove techniques*/
		System.out.println("   Abhi   ".strip());
		System.out.println("   Abhi   ".stripIndent());
		System.out.println("   Abhi   ".stripLeading());
		System.out.println("   Abhi   ".stripTrailing());
				
		
		System.out.println(s.substring(12));	/// considers range from the index to end
		System.out.println(s.substring(12, 16)); /// considers the given range
		
	}
}
