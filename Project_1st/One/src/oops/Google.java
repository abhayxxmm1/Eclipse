package oops;

public class Google {
	String ceo;
	String hq;
	String turnover;
	String email;
	String pass;
	
	Google(){
		
	}
	
	Google(String ceo,String hq,String turnover,String email,String pass)
	{
		this.ceo = ceo;
		this.hq = hq;
		this.turnover = turnover;
		this.email = email;
		this.pass = pass;
	}
	public void login(String email,String pass)
	{
		if (this.email==email && this.pass==pass)
		{
			System.out.println("Login sucess!");
		}
		else
		{
			System.out.println("Invalid Credentails!");
		}
		
	}
	
	public void displayGoogle()
	{
		System.out.println("CEO:"+ceo);
		System.out.println("Head Quater:"+hq);
		System.out.println("Turnover:"+turnover);
		System.out.println("______________");
	}

}
