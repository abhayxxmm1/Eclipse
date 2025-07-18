package tyss.in;

public class CarDriver {
	public static void main(String []args)
	{
		Car c =  Car.getCar();
		c.printCar();
		
		Car obj1 = Car.getCar();
		Car obj2 = Car.getCar();
		
		obj1.printCar();
		obj2.printCar();
	}
}
