package Collection;

public class Employee11Oct implements Comparable<Employee11Oct>{


	String name;
	int id;
	double sal;
	int yoe;
	String role;
	
	public Employee11Oct() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Employee11Oct(String name, int id, double sal, int yoe, String role) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.yoe = yoe;
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", sal=" + sal + ", yoe=" + yoe + ", role=" + role + "]";
	}
	
	public int compareTo(Employee11Oct ob)
	{
		if (this.sal > ob.sal) {
			
			return 1;
		}
		else if (this.sal < ob.sal) {
			
			return -1;
		
			
		}
		return 0;
	}
}
