package Strings;

public class S1 {

	public static void main(String[] args) {
		String s1 = "HI";
		String s2 = "Bye";
		String s3 = "HI";
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}
}
