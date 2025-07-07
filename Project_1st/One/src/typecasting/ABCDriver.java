package typecasting;

public class ABCDriver {
	public static void main(String[]args) {
		A a1 = new B();
		
		C c1 = (C)a1;
		a1.displayA();
//		c1.display();
		
	}

}
