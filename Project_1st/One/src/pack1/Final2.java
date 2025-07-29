package pack1;	// Static_Final_Variable

public class Final2 {
	
//	static final char CH;	// CTE
	static final int A = 100;	// static declare & initialization statement
	
	static final double PI;	// static block
	static
	{
		PI = 22.0/7.0;
	}
	
	public static void main(String[] args) {
		System.out.println(A);
		System.out.println(PI);
	}
}
