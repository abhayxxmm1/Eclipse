package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee11OctDriver {

	public static void main(String[] args) {
		
		ArrayList<Employee11Oct> db = new ArrayList<Employee11Oct>();
		
		db.add(new Employee11Oct("Phalak", 345, 5.0, 234, "consultant"));
		db.add(new Employee11Oct("latika", 345, 25000.0, 234, "consultant"));
		db.add(new Employee11Oct("vishaka", 345, 3500.0, 234, "consultant"));
		db.add(new Employee11Oct("Raj", 345, 40000.0, 2, "consultant"));
		db.add(new Employee11Oct("khajarya", 345, 50000.0, 1, "consultant"));
		
		System.out.println(db);
		
		Collections.sort(db);
		
		for (Employee11Oct e : db) {
			
			System.out.println(e.name);
		}
		
		System.out.println(db);
		
		System.out.println(Collections.max(db));
	}
}
