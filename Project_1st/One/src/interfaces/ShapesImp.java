package interfaces;

public class ShapesImp implements Shapes {
	@Override
	public void areaOfSquare(int side)
	{
		int area = side * side;
		System.out.println(area);
		
	}
	public void perimeterOfSquare(int side)
	{
		int area = 4 * side;
		System.out.println(area);
		
	}
	public void areaOfCircle(int rad)
	{
		double area = PI_VALUE * (rad*rad) ;
		System.out.println(area);
		
	}
	public void circumferenceOfCircle(int rad)
	{
		double area = 2 * PI_VALUE * rad;
		System.out.println(area);
		
	}
	public static void message()
	{
		System.out.println("This is a dirty calculator");
	}
}
