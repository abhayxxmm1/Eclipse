package hasarelationship;

public class Mobile {
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	String processor;

	Battery b1 = new Battery("Exide",1500.0,5000,"Li-ion");
	
	public Mobile() {
		
	}
	
	Mobile(String brand,double price,String name,int ram,int rom,String processor)
	{
		this.brand = brand;
		this.price = price;
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}
	
	public void displayMobile()
	{
		System.out.println("Brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("Name :"+name);
		System.out.println("Ram :"+ram);
		System.out.println("Rom :"+rom);
		System.out.println("Processor :"+processor);
		System.out.println("_______________");
	}
}
