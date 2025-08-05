package arrays;

import java.lang.reflect.Array;
import java.util.Iterator;

public class ReverseMerge {
	public static void main(String[] args) {
		int[]a = {10,20,30,40,50,60};
		int[]b = {90,80,70,60,50};
		int[]c = new int[a.length+b.length] ;
		
		for (int i=0; i<c.length; i++)
		{
			if(i<a.length)
			{
				c[a.length-1-i] = a[i];
			}
			else
			{
				c[a.length+a.length+b.length-1-i] = b[i-a.length];
			}
		}
		System.out.println(c);
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		System.out.println(c.length);
	}

}
