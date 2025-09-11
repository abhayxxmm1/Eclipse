package Strings;

public class S2 {

	public static void main(String[] args) {
		
		String s1 = new String("Hi");	/// FB this 2 ip's violates handshake property
		String s2 = new String("Hi");	/// Ea
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
