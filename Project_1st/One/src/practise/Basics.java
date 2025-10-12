package practise;

public class Basics {

	public static void main(String[] args) {
		
		coPrime(5, 9);
		
		
	}
	
	
	
	public static void coPrime(int n1, int n2)
	{
		
		int small = n1 <n2 ? n1 : n2;
		
		while (true) {
			
			if (n1%small==0 && n2%small==0) {
				break;
			}
			small--;
		}
		
		if (small==1) {
			System.out.println("co-");
		}
		else {
			System.out.println("nit");
		}
	}
	
	public static void extreact(int n)
	{
		
	}
}
