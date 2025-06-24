package cscorner;

public class HelloWorld 
{
		String name;
		String add;
		int age;
			
		HelloWorld (String name,String add)
		{
			this.name = name;
			this.add = add;
		}
		HelloWorld (String name,String add,int age)
		{
			this(name, add);	// Mandatory
			
			this.age = age;		// Not Mandatory
		}
		public void displayHelloWorld()
		{
			System.out.println("Name :"+name);
			System.out.println("Address :"+add);
			System.out.println("Age :"+age);
			
		
	}

}
