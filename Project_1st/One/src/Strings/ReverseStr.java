package Strings;

public class ReverseStr {

	public static void main(String[] args) {
		String w2 = "Hello";
		String rev = "";
		
		for (int i = w2.length()-1; i >=0; i--) {
			rev = rev + w2.charAt(i);
		}
		System.out.println(rev);
	}
}
