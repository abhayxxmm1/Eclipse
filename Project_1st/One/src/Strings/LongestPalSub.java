package Strings;
 

public class LongestPalSub {

	public static void main(String[] args) {
		String string = "malayalam";
		
		String s = addSpace(string);
		
		System.out.println(addSpace(string));
		System.out.println(removeSpace(s,' '));
		
		System.out.println(subString(s, 1, 5));
		
		System.out.println(longestPalSub(s));
		
	}
	
	public static String longestPalSub(String s)
	{
		s = addSpace(s);
		int max=0, i=1,j=1,k=1;
		
		String lomgestPalString = "";
		while (i<s.length()) {
			
			if (j>0 && k<s.length()-1) {
				
				if (s.charAt(j-1) == s.charAt(k+1)) {
					
					j--;
					k++;
				}else if (k-j>0) {
					
					String temp = s.substring(j,k+1);
					temp = removeSpace(temp,' ');
					
					if (temp.length()>max) {
						
						max=temp.length();
						
						lomgestPalString = temp;
					}
					
					i++;
					j=i;
							k=i;
				}else {

					i++;
					j=i;
							k=i;
				}
			}
			else {
				if(k-j>0) {
					
					String temp = s.substring(j,k+1);
					temp = removeSpace(temp,' ');
					
					if (temp.length()>max) {
						
						max=temp.length();
						
						lomgestPalString = temp;
					}
					
					i++;
					j=i; 	
							k=i;
				}
			}

		}
		
		return lomgestPalString;
	}
	
	public static String addSpace(String s)
	{
		String anString = " ";
		for (int i = 0; i < s.length(); i++) {
			
				
				anString += s.charAt(i)+" ";
			
		}
		return anString;
	}
	public static String removeSpace(String s,char ch)
	{
		String rmString = "";
		for (int i = 0; i < s.length(); i++) {
			 if (s.charAt(i)!= ch) {
				rmString+=s.charAt(i);
			}
		}
		return rmString;
	}
	
	public static String subString(String s,int start,int end)
	{
		String s1 = "";
		for (int i = start; i < end; i++) {
				
				s1+= s.charAt(i);
			
		}
		return s1;
	}
}
