package polymorphism;

public class Subg {
	String username;
	String pass;
	
	public Subg() {
		
	}
	public Subg(String username,String pass) {
		this.username = username;
		this.pass = pass;
		
		System.out.println("Login Succesful!");
	}
	int bullets = 30;
	
	public void forward() {
		System.out.println("moved 1 step forward");
	}
	public void backword() {
		System.out.println("moved 1 step forward");
	}
	public void turnRight() {
		System.out.println("Turned left");
	}
	public void turnLeft()
	{
		System.out.println("Turned left");
	}
	public void fire()
	{
		if(bullets>0) {
			System.out.println("Bullet fired");
			bullets--;
			System.out.println(bullets+"left");
		}
		else
		{
			System.out.println("reload!");
		}
	}
	public void reload()
	{
		bullets = 30;
	}
}
