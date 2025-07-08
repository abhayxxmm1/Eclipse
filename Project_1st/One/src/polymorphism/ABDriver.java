package polymorphism;

public class ABDriver {

	public static void main(String[] args) {
		A a1 = new B();
		
		System.out.println(a1.a); // variable Shadowing
		System.out.println(a1.ch); // variable Shadowing
		
		a1.demo();	// method overriding
		a1.test();	// method Shadowing
		
		A.test();	// correct way to call static block
	}

}
