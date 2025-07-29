package pack1;

public abstract class G {	
	
	public abstract void add(int a,int b);
	
//	private void sub(int a,int b) // concrete method(complete implementation)
//	{
//		int res = a-b;
//		System.out.println(res);
//	}
	
	abstract protected String multi();
	
	public static void mad()
	{
		System.out.println("im a mad mad person");
	}
	
	protected static void badAss()
	{
		System.out.println("i will be BasAss");
	}
	
//	abstract void divi(int a, int b);
//	private abstract void div(int a, int b);
	
	/**
	 * The abstract method div in type G 
	 * can only set a visibility modifier, 
	 * one of public or protected
	 */
	public static void main(String[] args) {
		mad();
	}
}
