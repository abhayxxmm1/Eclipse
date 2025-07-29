package wrapper;

public class Wrap4 {
	public static void main(String[] args) {
		Double d1 = new Double(2234.0);
		Double d2 = new Double(2234);
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		System.out.println(d1.hashCode());
		
		Boolean b1 = new Boolean(false);
		System.out.println(b1.hashCode());
	}
}
