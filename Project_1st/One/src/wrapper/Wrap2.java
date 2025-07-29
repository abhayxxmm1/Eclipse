package wrapper;

public class Wrap2 {
	public static void main(String[] args) 
	{
		
		Byte b1 = new Byte((byte) 126);	
		System.out.println(b1.toString());
		
		int i = 100;
		Integer i1 = new Integer(34);	// Boxing
		System.out.println(i1.toString()); // refer abstraction
		
		
		Character ch = new Character('a');
		System.out.println(ch.toString());
		
		Short s1 = new Short((short) 143);
		System.out.println(s1.toString());
		
		
		Boolean b = new Boolean(false);	// Boxing
		System.out.println(b.toString());
		System.out.println(b.getClass().getName()+"@"+Integer.toHexString(b.hashCode()));
		
		Float f1 = new Float(i);
		System.out.println(f1.toString());
		
		Double d1 = new Double(i);
		System.out.println(d1.toString());
		
		Long long1 = new Long(340);
		System.out.println(long1.toString());
		System.out.println(long1.getClass().getName()+"@"+Integer.toHexString(long1.hashCode()));
	}
}
