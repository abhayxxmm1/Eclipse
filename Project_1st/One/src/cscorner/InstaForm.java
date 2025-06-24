package cscorner;  // Constructor Overloading

public class InstaForm 
{
	String username;
	long phno;
	String email;
	String password;
	
	InstaForm() // Beggar with pack of dollars  
	{
//		No argument constructor (Default constructor is added by the compiler implicitly 
//								when their are no constructors in the class)
	}
	InstaForm(String username,long phno,String email,String password)
	{
		this.username = username;
		this.phno = phno;
		this.email = email;
		this.password = password;
		
	}
	InstaForm(String username,String password)
	{
		this.username = username;
		this.password = password;
	} 
	InstaForm(long phno,String password)
	{
		this.phno = phno;
		this.password = password;
	}
//	-------------------------------------------------------
	InstaForm(String email,String username,String password)
	{
		this.email = email; 
		this.password = password;
	}
	
	InstaForm(long phno,String email,String password)
	{
		this.email = email;
		this.password = password; 
	}
	public void displayInstaForm()
	{
		System.out.println("User x Name 	: "+username);
		System.out.println("Phone Number 	: "+phno);
		System.out.println("Email Id 	: "+email);
		System.out.println("Password 	: "+password);
		System.out.println("__________________");
		
	}
	
}
