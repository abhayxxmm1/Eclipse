package interfaces;

public class WhysAppImp2 extends WhysAppImp1{
	public WhysAppImp2()
	{
		
	}
	public WhysAppImp2(String user,long phno)
	{
		super(user, phno);
	}
	public void message(long phno,String msg)
	{
		if(messageCount<=msgLimit)
		{
			System.out.println("This end to end encurypted");
			System.out.println(msg);
			System.out.println("Text msg Sent!");
			
			messageCount++;
		}
		else {
			System.out.println("Daily msg limit exceaded!");
		}
	}
	public void status(String ip)
	{
		System.out.println(ip);
		System.out.println("Status Updated!");
	}
}
