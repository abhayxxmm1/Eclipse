package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDimMulti {

	public static void main(String[] args) {
		
		int [][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int [][]b = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		int [][]c= new int[3][3];
		
		int [][]ans = multi(a, b, c);
		for (int i = 0; i < c.length; i++) {
		    for (int j = 0; j < c[0].length; j++) {
		        System.out.print(c[i][j] + " ");
		    }
		    System.out.println();
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans));
		}
		

		
		
	}
	
	public static int[][] multi(int[][]a,int[][]b,int[][]c)
	{
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				int sum = 0;
				
				for (int k = 0; k < a[j].length; k++) {
					
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
		return c; 
	}
}
