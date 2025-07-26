package exception;

import java.util.Iterator;

public class Exp5 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
		{
			System.out.println("I love Bharat");
			
			try {
				Thread.sleep(-1000);
			} 
			catch (	InterruptedException e) 
			{
				
			}
			catch (IllegalArgumentException e) 
			{
				System.err.println("negative time out given");
			}
		}

	}

}
