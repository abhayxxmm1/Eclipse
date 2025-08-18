package arrays;

import java.util.Arrays;

public class PosNeg {

	public static void main(String[] args) {
int neg[] = {-1,-23,235,-9,4,6,654,-3};


		
		System.out.println(Arrays.toString(posNeg(neg)));
		System.out.println(Arrays.toString(oddEve(neg)));
		
	}
	public static int[] posNeg(int[]a)
	{
		int i=0, j=a.length-1;
		while(i<j)
		{
			while(a[i]<0)
			{
				i++;
//				System.out.println(i);
//				break;
			}
			while(a[j]>=0)
			{
				j--;
//				System.out.println(j);
//				break;
			}
			if (i<j) {
//				System.out.println(i);
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}

	public static int[] oddEve(int[]a)
	{
		int i=0, j=a.length-1;
		while(i<j)
		{
			while(a[i]%2!=0)
			{
				i++;
//				System.out.println(i);
//				break;
			}
			while(a[j]%2==0)
			{
				j--;
//				System.out.println(j);
//				break;
			}
			if (i<j) {
//				System.out.println(i);
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}


}

