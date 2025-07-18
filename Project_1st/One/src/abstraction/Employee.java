package abstraction;

public class Employee {
	String name;
	int empid;
	double sal;
	
	public Employee() {
		
	}
	
	public Employee(String name,int empid,double sal) {
		this.name = name;
		this.empid = empid;
		this.sal = sal;
	}
	public String toString()	// to changing the ObjectReferenceName according to us
	{							// like the car no number plate for easy memorizing & understanding
		return "[Name :"+name+", email :"+empid+", Salary :"+sal+"]";
	}	// overriding object reference
	
	
	
	public boolean equals(Object o)
	{
		Employee e = (Employee)o; // passed Object
		
		if(this.name==e.name && this.empid==e.empid && this.sal==e.sal)
		{
			return true;
		}
		return false;
	}
}
