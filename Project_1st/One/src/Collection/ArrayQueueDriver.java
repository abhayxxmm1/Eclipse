package Collection;

public class ArrayQueueDriver {

	public static void main(String[] args) {
		ArrayQueue<Integer> a1 = new ArrayQueue<Integer>();
		
		a1.add(1);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		a1.add(123);
		
		a1.remove();
		System.out.println(a1.element());
		
		System.out.println(a1.size());
		System.out.println(a1.peek());
		System.out.println(a1.offer(123));
		
		System.out.println(a1);
	}
}
