package typecasting;

public class FatherSonDriver {
	public static void main(String[]args) {
		Father f1 = new Son(); //	Up Casting
		f1.drinking();
		
		Father f2 = new Father();
		Son s1 = (Son)f2; //	Down Casting
		s1.smoking(); 	//	ClassCastException
	}

}
