package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Sorting {
	public static void main(String[] args) {
		int []a = {100,90,52,31,3};
		System.out.println(Arrays.toString(bubbleSort(a)));


		
		
	}
	
	public static int[] bubbleSort(int[]a)
	{
		for (int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
//	public static void enhancedBubbleSort(int[]a)
//	{
//		int i;
//		for( i=0; i<a.length-1; i++)
//		{
//			boolean check = false;
//			for(int j=0; j<a.length-1-i; j++)
//			{
//				check = true;
//				int temp = a[j];
//				a[j] = a[j+1];
//				a[j+1] = temp;
//			}
//			
//			if (!check) {
//				break ;
//			}
//		}
//	}
}
