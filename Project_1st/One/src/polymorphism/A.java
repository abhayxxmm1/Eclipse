package polymorphism;

public class A {
	static int a = 100;
	char ch = 'a';
	
	public void demo()
	{
		System.out.println("From non-static demo() of class A");
	}
	public static void test()
	{
		System.out.println("From static tests() of class A");
	}
}
