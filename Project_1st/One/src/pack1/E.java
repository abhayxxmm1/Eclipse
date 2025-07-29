package pack1;

public class E {
	protected static int a = 10;
	protected double d = 100.0123;
	
	protected void test() {
		System.out.println("From protected non-static test of class E");
	}
	
	
	public static void main(String[] args) {
		E e1 = new E();
		e1.test();
		System.out.println(e1.d);
		System.out.println(a);
	}
}
