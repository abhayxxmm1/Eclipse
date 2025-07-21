package hasarelationship;

public class Computer {
	String brand;
	String processor;
	int ram;
	int rom;
	double price;
	Pendrive p1;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String brand,String processor,int ram,int rom,
			double price) {
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
		
		
	}
	public void displayComputer()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Processor :"+processor);
		System.out.println("Ram :"+ram);
		System.out.println("Rom :"+rom);
		System.out.println("Price :"+price);
	}
	
	public void insertPendrive(String brand,int memory,double price,int speed)
	{
		p1 = new Pendrive(brand,memory,price,speed);
		System.out.println("Pendrive Inserted");
	}
}
