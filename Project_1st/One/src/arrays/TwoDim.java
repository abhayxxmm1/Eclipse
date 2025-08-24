package arrays;



public class TwoDim {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
//				System.out.print(a[i][j]+" ");
				sum = sum + a[i][j];
				
			}
			
//			System.out.println(sum); 
//			sum = 0;					// sum of sub array
		}
//		System.out.println(sum); // sum of all elements of 2d array
		
		
		
		
		
//		for (int i = 0; i < a.length; i++) {
//					
//				for (int j = 0; j< a.length; j++) {
//						
//					if (j==i) {
//							
//						sum = sum + a[i][j];
//					}
//						
//				}
//					
//				System.out.println(sum); 
//		}

		

//		for (int i = 0; i < a.length; i++) {
//					
//			for (int j = 0; j< a.length; j++) {
//						
//				if (j==0 || i==0 || j==a.length-1 || i==a.length-1) {
//							
//					sum = sum + a[i][j];
////					System.out.print(a[i][j]+" ");
//				}
//		
//						
//			}
//					
//			
//		}
//		
//		System.out.print(sum);
	}
}
