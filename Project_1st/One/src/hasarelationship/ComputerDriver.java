package hasarelationship;

public class ComputerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer c1 = new Computer("HP","I-5",8,500,4000.0);
//		Computer c1 = null; 	// NullPointerExeption
		c1.displayComputer();
		c1.insertPendrive("Sandisk", 32, 40, 5000);
		
		c1.p1.displayPendrive();
	}

}
