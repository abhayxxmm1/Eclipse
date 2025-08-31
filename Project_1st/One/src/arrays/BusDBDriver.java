package arrays;

public class BusDBDriver {

	
	public static void main(String[] args) {
		
		
		BusDB d1 = new BusDB() ;
		
		d1.addBus("VRL","MH 12 CJ3454","Pune","Bengaluru","AC","Seater",
				"06:00PM","9:00AM",
				980,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Jalhalli Cross","Silk Board","BTM Layout",
						"Majestic"});
		
		d1.addBus("Inter City","MH 23 HJ5675","Pune","Mumbai","Non-AC","Seater",
				"06:45AM","09:45AM",180,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Bandra","CST","Andheri","Vashi","Malad","Borivali"}) ;
		
		d1.addBus("Purple","MH 35 GY4654","Pune","Nagpur","Non-AC","Seater", 
				"07:00PM","08:00AM",800,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Chatrapati Square","Dharmpet","Wadi","Ajni","Chich Bhavan" }) ;
		
		
		d1.addBus("Dolphin","MH 12 UY54645","Pune","Goa","AC","Sleeper","09:00PM","08:00AM",
				430,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Panaji","Vasco Da Gama","Arambol","Vagator","Candolim"});
		
		d1.addBus("Purple","MH 12 CJ5454","Pune","Bengaluru","Non-AC","Seater",
				"04:00PM","7:00AM",
				980,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Jalhalli Cross","Silk Board","BTM Layout",
						"Majestic"});
		
		d1.addBus("Dolphin","MH 23 HJ5435","Pune","Mumbai","AC","Seater",
				"04:00AM","7:30AM",180,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Bandra","CST","Andheri","Vashi","Malad","Borivali"}) ;
		
		d1.addBus("VRL","MH 12 OJ54645","Pune","Goa","Non-AC","Sleeper","09:50PM","10:00AM",
				430,new String[] {"Warje","Swargate","Katraj","Wakad"},
				new String[] {"Panaji","Vasco Da Gama","Arambol","Vagator","Candolim"});
		
		
		
		d1.showBusDB();
		
		System.out.println("---------------------------------");
		d1.searchBuses("Pune","Nagpur","-");
	}
}