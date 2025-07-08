package polymorphism;

public class B extends A{
	static int a = 10;
	String ch = "ABC";
	
	public void demo()
	{
		System.out.println("From non-static demo() of class B");
	}
	public static void test()
	{
		System.out.println("From static tests() of class B");
	}
}
