package polymorphism;

public class Subg2 extends Subg{
	public Subg2() {
		
	}
	public Subg2(String username,String pass) {
		this.username = username;
		this.pass = pass;
	}
	public void backword()
	{
		System.out.println("moved 1 step backword");
	}
	public void turnRight()
	{
		System.out.println("Turned right");
	}
}
