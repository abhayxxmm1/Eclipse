package Strings;

public class SegrigateToVowelsCons {

	public static void main(String[] args) {
		
		String s = "Aeroplane123";
		
		String vowel = "";
		String cons = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch>='a' && ch<='z'|| ch>='A' && ch>='Z') {
				
				if (ch=='a' || ch=='A' || ch=='e' || ch=='E' 
						|| ch=='i' || ch=='I' || ch=='o' || ch=='O'
						|| ch=='u' || ch=='U') {
					vowel = vowel + ch;
				}
				else {
					
					cons = cons + ch;
				}
			}
		}
		System.out.println(vowel);
		System.out.println(cons);
	}
}
