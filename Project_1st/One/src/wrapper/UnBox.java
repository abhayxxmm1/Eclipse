package wrapper;

public class UnBox {
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(124);
		int ans = i1.intValue();		// un-boxing
		System.out.println(i1.toString());
		System.out.println(i1==ans);
		
		Character ch = new Character('b');
		char chAns = ch.charValue();	// un-boxing
		System.out.println(chAns);
		
		Boolean  b1 = new Boolean(true);
		boolean ans2 = b1.booleanValue();	// un-boxing
		System.out.println(ans2);
 	}
}
