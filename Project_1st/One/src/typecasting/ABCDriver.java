package typecasting; 	// with Multi-level inheritance

public class ABCDriver {
	public static void main(String[]args) {
		A a1 = new B();
		a1.displayA();
//		C c1 = (C)a1;	// ClassCastException
		
//		c1.display();
		a1.displayA();
	}

}
