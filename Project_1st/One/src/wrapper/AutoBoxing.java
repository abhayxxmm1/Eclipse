package wrapper;

public class AutoBoxing {
	public static void main(String[] args) 
	{
		Integer a = 10;	// Auto-boxing
		System.out.println(a.toString());
		int i = a;	// Auto-unboxing
		
		System.out.println(i);
		
		Double d = 234.234;
		double d2 = d;
		System.out.println(d2);
		
		System.out.println(a==i);
		System.out.println(a+d);
		System.out.println(a+d2+i);
	}
}
