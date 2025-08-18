package arrays;

import java.util.Arrays;


public class Qes {
	public static void main(String[] args) {
		int rep[] = {1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,4,4,4};
//		int []a = {1,1,1,1,2,2,2,4,4,4,4,4,5,5,5,5};
		longestRepeating(rep);
		
		smallestReapeating(rep);
		
		int []pal = {1,2,3,2,1};
		palindromicArray(pal);
		
		int neg[] = {-1,-23,235,-9,4,6,654,-3};
		
		System.out.println(Arrays.toString(posNeg(neg)));
		
	}
	public static void longestRepeating(int[]a)
	{
		int i, index = 0, max = -1, ct = 0;
		for(i = 0; i<a.length-1; i++)
		{
			if (a[i]==a[i+1]) {
				
				ct++;
				
			}
			else {
				
				if (ct > max) {
				
					max = ct;
					index = i;
					
					ct=0;
				}
			}
		}
		System.out.println("At index : "+index+" & count is : "+max);
	}
	
	public static void smallestReapeating(int[]a)
	{
		int i, index=0, min=Integer.MAX_VALUE, ct =0;
		for(i=0; i<a.length-1; i++)
		{
			if (a[i]==a[i+1]) {
				ct ++;
			}
			else {
				if (ct < min) {
					
					min = ct;
					index = i;
					
				}
				ct=0;
			}
		}
		if (ct < min) {
			
			min = ct;
			index = i;
			
		}
		System.out.println("index : "+index+" min count "+min);
	}
	
	public static void palindromicArray(int[]a)
	{
		int []temp = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			temp[a.length-1-i] = a[i];
		}
		int i = 0;
		
		while (i<a.length)
		{
			if (a[i]!= temp[i]) {
				break ;
			}
			i++;
		}
		if (i==a.length) {
			System.out.println("P");
		}
		else {
			System.out.println("NP");
		}
		System.out.println(Arrays.toString(temp));
	}

	
}
