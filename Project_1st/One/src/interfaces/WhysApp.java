package interfaces;

public interface WhysApp {
	
	int msgLimit = 100;
	
	void message(long phno,String msg);
	
	void voiceMsg(long phno,String msg);
	
	void status(String ip);
	
	public static void greeting(String name)
	{
		System.out.println("Hey!"+name+"Welcome to WhysApp");
	}
	
}
