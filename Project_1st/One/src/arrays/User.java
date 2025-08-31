package arrays;


public class User {

	String name;
	int age;
	char gen;
	long phno;
	String boarding;
	String dest;
	String email;
	
	
	public User(String name, int age, char gen, long phno,
			String boarding, String dest, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.phno = phno;
		this.boarding = boarding;
		this.dest = dest;
		this.email = email;
	}
	
	public String toString()
	{
		return "[Name"+name+", Gen"+gen+"]";
	}
	
}
