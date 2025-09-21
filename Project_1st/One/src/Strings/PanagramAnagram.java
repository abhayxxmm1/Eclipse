package Strings;

public class PanagramAnagram {

	public static void main(String[] args) {
		
		String d = "Pack my ox with five dozen liquor jugs";
		System.out.println(panagram(d));
	}
	
	public static boolean panagram(String s) {
		s= s.toLowerCase();
		int[]ar = new int[26];
		
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			if (ch<='z' && ch>='a') {
				
				ar[s.codePointAt(i)-'a']++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]==0) {
				
				return false;
			}
		}
		return true;
	}
	
	public static boolean anagram(String s1,String s2)
	{
		if (condition) {
			
		}
	}
}
