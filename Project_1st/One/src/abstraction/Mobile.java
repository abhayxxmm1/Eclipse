package abstraction;

public class Mobile {
	 String brand;
	 String name;
	 int cam;
	 String processor;
	 int imei;
	 long phno;
	 
	public Mobile(){
		
	}
	
	public Mobile(String brand,String name,int cam,String processor,
			int imei,long phno) {
		this.brand = brand;
		this.name = name;
		this.cam = cam;
		this.processor = processor;
		this.imei = imei;
		this.phno = phno;
	}
//	public String toString()
//	{
//		return "[ Brand : "+brand+", Name : "+name+", Camera : "+cam+
//				", Processor : "+processor+", IMEI : "+imei+", Phno : "
//				+phno+" ]";
//	}
	public boolean equals(Object ref) 
	{
		Mobile mi = (Mobile)ref;
		
		if(name==mi.name&&this.brand==mi.brand&&this.cam==mi.cam
				&&processor==mi.processor&&imei==mi.imei&&phno==mi.phno)
		{
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return cam+imei+(int)phno+brand.hashCode()+name.hashCode();
	}
}
