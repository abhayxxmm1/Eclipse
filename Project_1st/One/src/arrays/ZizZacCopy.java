package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ZizZacCopy {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50,60};
		int[]b = {90,80,70,60,50};
		
		int[]ar = {3,9,50,4,8,30,21,80,0,80,60,10,3,4};
		
		System.out.println(Arrays.toString(zigZagCopy(a, b)));
		System.out.println(Arrays.toString(halfReverseCopy(a, b)));
		System.out.println(Arrays.toString(halfRevCopy(a, b)));
		System.out.println(maxVal(a));
		System.out.println(minValue(ar));
		System.out.println(secondMax(ar));
		System.out.println(secMin(ar));
	}
	
	public static int[] zigZagCopy(int[]a,int[]b)
	{
		int[]ans = new int[a.length+b.length] ;
		int i=0, j=0;
		
		while(j<ans.length)
		{
			if(i<(a.length<b.length?a.length:b.length))
			{
				ans[j] = a[i];
				ans[j+1] = b[i];
				i++;
				j+=2;
			}
			else 
			{
				if (a.length<b.length) 
				{
					ans[j++] = b[i++];
				}
				else 
				{
					ans[j++] = a[i++];
				}
			}
		}
		return ans;
	}
	
	public static int[] halfReverseCopy(int[]a,int[]b)
	{
		// mine logic
		int []ans = new int[a.length+b.length];
		
		for (int i=0; i<ans.length; i++)
		{
			if (i<a.length) 
			{
				ans[i] = a[i];
			}
			else 
			{
//				ans[a.length+a.length+b.length-1-i] = b[i-a.length];
				ans[i] = b[ans.length-1-i]; /* sir */
			}
		}
		return ans;
	}
	
	public static int[] halfRevCopy(int[]a,int[]b)
	{
		// when we do not know how many iterations are there we use while 
		int []c = new int[a.length+b.length];
		int i =0;
		while(i<c.length)
		{
			if (i<a.length) 
			{
				c[i] = a[i];
				i++;
			}
			else 
			{
				c[i] = b[c.length-1-i];
				i++;
			}
		}
		return c;
	}
	
	public static int maxVal(int[]a)
	{
		
		int max = Integer.MIN_VALUE;
		for (int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max =  a[i];
			}
		}
		return max;
	}
	
	public static int minValue(int[]ar)
	{
		int min = Integer.MAX_VALUE;
		for (int i=0; i<ar.length; i++)
		{
			if (ar[i]<min) 
			{
				min= ar[i];
			}
		}
		return min;
	}
	
	public static int secondMax(int []ar)
	{
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i = 0; i<ar.length;i++)
		{
			if (ar[i]>max)
			{
				secMax = max;
				max = ar[i];
			}
			else if (ar[i]>secMax && ar[i]!=max) 
			{
				secMax = ar[i];
				
			}
		}
		return secMax;
	}
	
	public static int secMin(int[]ar)
	{
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for (int i=0; i<ar.length; i++)
		{
			if (ar[i]<min) 
			{
				secMin = min;
				min = ar[i];
			}
			else if(ar[i]<secMin && ar[i]!=min)
			{
				secMin=ar[i];
			}
		}
		return secMin;
	}
	
	
}
