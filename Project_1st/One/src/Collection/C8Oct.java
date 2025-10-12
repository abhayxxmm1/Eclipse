package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class C8Oct {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(132);
		a1.add(15);
		a1.add(1450);
		a1.add(450);
		a1.add(60);
		
		ListIterator<Integer> i = a1.listIterator(); // iterate
		
		
		while (i.hasNext()) {
			Integer integer = i.next();
			System.out.println(integer);
		}
		
		ListIterator<Integer> i2 = a1.listIterator(a1.size()); // reverse iterate
		
		while (i2.hasPrevious()) {
			Integer ii =  i2.previous();
			System.out.println(ii);
		}
		
		System.out.println(a1);
		
//		ArrayList<Employee> e1 = 
	}
}
