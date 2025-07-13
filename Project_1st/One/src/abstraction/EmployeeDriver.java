package abstraction;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Raju",85667,60000.0);
		Employee e2 = new Employee("Raju",85667,60000.0);
		System.out.println(e1);
		
		System.out.println(e1==e2);
		
		System.out.println(e1.equals(e2));	// Equals used to compare attributes of Object
	}

}
