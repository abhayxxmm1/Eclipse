package arrays;

public class BusDriver {

	public static void main(String[] args) {
		
//		Bus b1 = new Bus("Sangitam","Mh - 19","Pune",
//			"Jalgaon", "Ac", "Sleaper", "09:00PM", "07:00AM", 386,
//			new String[] {"Warje","Swargate","Katraj","Wakad"},
//			new String[] {"Khole nagar","Mandraj Park","ssbt","IMR","Akashwani"});
//		
//		b1.showSheats();
//		
//		b1.displayBus();
//		
//		b1.bookSeats("Rahuli",22,'F',974645343l,"Wakad","IMR","rahul@gmail.com",
//				'C',2,1);
		
		Bus b1 = new Bus("VRL","MH 12 CJ3454","Pune","Bengaluru","AC","Seater",
				"6:00PM","9:00AM",
				980,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Jalhalli Cross","Silk Board","BTM Layout",
						"Majestic"});
		
		
		b1.displayBus();
		
		b1.bookSeat("Rahuli",22,'F',974645343l,"Wakad","BTM Layout","rahul@gmail.com",
				'C',2,1);
		b1.bookSeat("Raju",29,'M',9876543210l,"Warje","Majestic",
				"raju@gmail.com",'D',4,1);
		b1.bookSeat("Rani",35,'F',9876543453l,"Swargate","Majestic",
				"rani@gmail.com",'D',3,1);
		
		
		b1.bookSeat("Moni",24,'F',8654323444l,"Swargate","Silk Board","moni@gmail.com",
				'C',1,2);
		
//		b1.bookSeat("Vishal",23,'M',898565454l,"Katraj","Jalhalli Cross","vishal@gmail.com",'C', 1, 2);
//		b1.showSeats();
	}
}
