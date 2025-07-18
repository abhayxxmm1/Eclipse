package abstraction;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile("iphone","17pro",4,"A17 Bionic",2523,1234567890l);
		Mobile s = new Mobile("iphone","17pro",4,"A17 Bionic",2523,1234567890l);
		
		System.out.println(m);
		System.out.println(s);
		
		System.out.println(m.hashCode());
		System.out.println(s.hashCode());
		
		System.out.println(m==s);
		System.out.println(m.equals(s));
		
		System.out.println(m);
	}

}
