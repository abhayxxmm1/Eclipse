package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveChar {

	public static void main(String[] args) {
		
		String g = "jhgutfqwfasdqwgdfdskj sdknmmmmmmm";
		
		
		System.out.println(removeChar(g, 'f'));
//		System.out.println(Arrays.toString(removeDupe(g)));
		System.out.println(removeDupe(g));
		
		System.out.println(replace(g, 'f', "***"));
		
	}
	
	public static String removeChar(String g, char a)
	{
		String r = "";
		for (int i = 0; i < g.length(); i++) {
					
			char ch = g.charAt(i);
			if (ch!=a) {
				
				r+= ch; // string = string + charAt( );
			}

		}
		return r;
		
	}
	
	public static /*char []*/String removeDupe(String s)
	{
		String nw = "";
		char []ch = new char[s.length()];
		
		/// converting string to array
		for (int i = 0; i < s.length(); i++) {
			
			ch[i] = s.charAt(i);
		}
		
		int du [] = new int[s.length()];
		
		/// using frequency logic
		for (int i = 0; i < du.length; i++) {
			
			if (du[i]!=-1) {
				
				int count = 0;
				for (int j = i+1; j < du.length; j++) {
					
					if (ch[i]==ch[j]) {
						
						count++;
						du[j] = -1;
					}
					
				}
				du[i]=count;
			}
			
		}
		
		int count=0;
		for (int i = 0; i < du.length; i++) {
			if (du[i]==-1) {
				count++;
			}
		}
		
		/** focus on this part*/
		char ans[] = new char[s.length()-count];
		for (int i = 0,j=0; i < du.length; i++) {
			if (du[i]!=-1) {
				
				ans[j] = ch[i];
				j++;
			}
		}
		
		for (int i = 0; i < ans.length; i++) {
			nw = nw + ans[i];
		}
		
		return nw;
	}
	
	public static String replace(String s,char c,String r)
	{
		String g="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch==c) {
				
				g = g + r;	///
			}
			else {
				g = g + ch;	///
			}
		}
		return g;
	}
	
	public static int index(String g,String search)
	{
		
		for (int i = 0; i < g.length(); i++) {
			
			char ch = g.charAt(i);
			if (ch==search.charAt(0)) {
				
				
				
			}
			
		}
		
	}
	
}

