package typecasting;	// with Hierarchical Inheritance

public class DEFDriver {
	public static void main(String[]args)
	{
		D f1 = new F();
		
		f1.display();
		
//		E e1 = (E)f1;	// ClassCastException
//		e1.display();	
	}
}
