package typecasting;

public class DEFDriver {
	public static void main(String[]args)
	{
		D f1 = new F();
		
		f1.display();
		
		E e1 = (E)f1;
		e1.display();
	}
}
