package arrays;


import java.util.Arrays;
import java.util.Iterator;






public class ArrayManipulation {
	public static void main(String[] args) 
	{
		int[]ar = {10,23,4,3,5,64,3};
		System.out.println(Arrays.toString(insetElement(ar, 32560)));
		System.out.println(Arrays.toString(insertFirst(ar, 110)));
		System.out.println(Arrays.toString(insertAnyIndex(ar, 450, 4)));
		System.out.println(Arrays.toString(removeIndex(ar, 0)));
		System.out.println(Arrays.toString(removeElement(ar, 3)));
		System.out.println(Arrays.toString(mergeAtAnyIndex(new int[]{10,20,23,53,1}, new int[] {22,34,13}, 2)));
		System.out.println(Arrays.toString(removeRange(ar, 2, 4)));
		System.out.println(isSorted(ar));
		checkPresenese(ar,new int[] {10,3});
	}

//	i will do this today itself
	public static int[] insetElement(int[]ar,int ele)
	{
		int[]ans = new int[ar.length+1];
		for(int i=0; i<ans.length; i++)
		{
			if (i<ar.length) 
			{
				ans[i] = ar[i];
			}else
			{
				ans[i] = ele;
			}
		}
		return ans;
	}
		
	public static int[] insertFirst(int[]ar,int ele)
	{
		int[]ans = new int[ar.length+1];
		ans[0] = ele;
		for (int i = 1; i <ans.length; i++)
		{
			ans[i] = ar[i-1];
		}
		return ans;
	}
	
	public static int[] insertAnyIndex(int[]ar,int ele,int index)
	{
		int[]ans = new int[ar.length+1];
		for (int i =0 ; i<ans.length; i++)
		{
			if(i<index)
			{
				ans[i] = ar[i];
			}
			else if(i==index)
			{
				ans[i] = ele;
				
			}
			else 
			{
				ans[i] = ar[i-1];
			}
		}
		return ans;
		
	}
	public static int[] removeIndex(int[] ar,int index) 
	{
		int[] ans = new int[ar.length-1];
		if(index<=0 && index<ar.length)
		{
			for (int i=0; i< ar.length; i++)
			{
				if(i<index)
				{
					ans[i]=ar[i];
				}
				else if(i>index)
				{
					ans[i-1] = ar[i];
				}
			}
		}
		return ans;
	}
	public static int[] removeElement(int[]ar, int ele)
	{
		int i;
		for( i =0; i<ar.length; i++)
		{
			if(ar[i]==ele)
			{
				break;
			}
		}
		return removeIndex(ar, i);
	}
	
	public static int[] mergeAtAnyIndex(int[]a,int[]b,int index) // here we are merging b into a 
	{
		int[]ans = new int[a.length + b.length];
		if(index>=0 && index<=a.length)
		{
			
			
			for(int j=0,i=0; j<ans.length; j++)
			{
				if(j<index)
				{
					ans[j] = a[j];
				}
				else if(j<b.length)
				{
					ans[j] = b[i];
					i++;
				}
				else
				{
					ans[j] = a[j-b.length];
				}
			}
		}
		return ans;
	}

	public static int[] removeRange(int[]ar,int start,int end)
	{
		if (start<end && start>=0 && end<ar.length) {
			int[]ans = new int[ar.length + (end-start)];

			for(int i=0; i<ans.length ; i++)
			if (i<start) {
				ans[i ] = ar[i];
				
			}
			else
			{
				ans[i] = ar[i-(end-start)];
			}
			return ans;
		}
		return null;
	}
	
	public static boolean isSorted(int[]ar)
	{
		for (int i=0; i < ar.length; i++) {
			
			if(ar[i]>ar[i+1]) {
				
				return false;
				
			}
		}
		return true;
	}
	
	public static void checkPresenese(int[]a, int[]b)
	{
		for (int i = 0; i < b.length; i++) {
			
			int j;
			for (j=0; j<a.length; j++) {
				
				if (b[i]==a[j]) {
					
					break ;
				}
			}
			
			if (j<a.length) {
				
				System.out.println(b[i]);
			}
		}
	}
}













