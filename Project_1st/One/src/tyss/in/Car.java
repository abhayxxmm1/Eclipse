package tyss.in;
import java.util.Scanner;

// Private Constructor //
public class Car {
	String brand;
	String model;
	String type;
	double speed;
	double price;
	int cc;
	
	static Scanner sc = new Scanner(System.in);
	
	private Car(String brand,String model,String type,
			double speed,double price,int cc){
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.speed = speed;
		this.price = price;
		this.cc = cc;
		
	}
	
	public static Car getCar()
	{
		System.out.println("Enter brand, model, type, SPEED, price, cc");
		
		return new Car(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble()
				,sc.nextInt());// Hard coded values jo tu code se dal raha hai 
//		actual arguments
	}
	
	public void printCar() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Type :"+type);
		System.out.println("Speed :"+speed);
		System.out.println("Price :"+price);
		System.out.println(cc);
	}
}
