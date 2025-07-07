package hasarelationship;

public class Son extends Father {
	String name = "Ramu";
	
	public void display(){
		
		System.out.println(name);	
		System.out.println(super.name);	
		
		super.display();
		
//		System.out.println(super);	
		System.out.println(this);	
	}
	
	public void demo() {
		System.out.println("From demo");	
	}
	
}
