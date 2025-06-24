package hasarelationship;

public class Battery {
	
	String name;
	double price;
	int mah;
	String type;
	
	Battery (){
		
	}
	
	Battery(String name,double price,int mah,String type)
	{
		this.name = name;
		this.price = price;
		this.mah = mah;
		this.type = type;
		
		System.out.println("Battery Created");
	}
	
	public void displayBattery()
	{
		System.out.println("Name :"+name);
		System.out.println("price :"+price);
		System.out.println("Mili amphower :"+mah);
		System.out.println("Type of Battery :"+type);
		System.out.println("_______________");
	}

}
