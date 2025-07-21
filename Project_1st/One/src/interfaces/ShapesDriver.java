package interfaces;

public class ShapesDriver {
	public static void main(String[] args) {
		Shapes s1 = new ShapesImp();
		
		s1.areaOfCircle(100);
		s1.areaOfSquare(10);
		s1.circumferenceOfCircle(100);
		s1.perimeterOfSquare(100);
		
//		ShapesImp.message();

	}
}
