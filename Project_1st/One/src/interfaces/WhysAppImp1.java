package interfaces;

/**	
 * because we need new features in application
 * new feature are created in contract/Super class/interface
 * and to launch a new version a new class is created
 * which only overrides the remaining non-static methods
 * therefore, we need to create this class abstract 
 * due to all the methods of interface class/Super class
 * are not override by the subclass  
 */
public abstract class WhysAppImp1 implements WhysApp{
	int messageCount;
	String user;
	long phno;
	
	public WhysAppImp1() {
		// TODO Auto-generated constructor stub
	}
	
	public WhysAppImp1(String user,long phno)
	{
		this.user = user;
		this.phno = phno;
		
		System.out.println("account Created");
	}
	
	public void message(long phno,String msg)
	{
		if(messageCount<=msgLimit)
		{
			System.out.println(msg);
			System.out.println("TestmsgSent");
		}
		else {
			System.out.println("Daily msg Limit exceeded!");
		}
	}
	public void voiceMsg(long phno,String msg)
	{
		if(messageCount<=msgLimit)
		{
			System.out.println(msg);
			System.out.println("Voice msg sent");
			
			messageCount++;
		}
		else {
			System.out.println("Daily limit exceeded!");
		}
	}
}
