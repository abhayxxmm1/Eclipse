package interfaces; // it is like a contract

public interface Shapes {
	
	double PI_VALUE = 21.0/7.0;
	
	void areaOfSquare (int sides); //  all non-satic methods are by-default public
								// & abstract so its not necessary to for a programmer 
								//	to prefix  public & abstract modifier
	
	void perimeterOfSquare (int sides);
	
	void areaOfCircle(int rad);
	
	public abstract void circumferenceOfCircle(int rad);
	
	public static void message() 	// can be used like A message for the developer
	{
		System.out.println("Welcome to shapes Calculator");
	}
}
