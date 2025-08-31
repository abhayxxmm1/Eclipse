package arrays;

public class BusDB {

	int count ;
	
	int startEndCount ;
	
	Bus[] buses = new Bus[10];
	
	Bus[] startEnd = new Bus[10] ;
	
	public BusDB() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean addBus(String name, String no, String start, String end, String type, 
			String seatType, String startTime,
			String endTime, int dist, String[] boarding, String[] drop)
	{
		if (count<=buses.length*0.7) {
			
			buses[count] = new Bus(name, no, start, end, type, seatType, startTime, endTime, 
					dist, boarding, drop) ;
			
			System.out.println(name+" Bus added!");
			
			count++ ;
		}
		else
		{
			Bus []temp = new Bus[buses.length*2] ;
			
			for (int i = 0; i <count; i++) {
				
				temp[i] = buses[i] ;
			}
			
			buses= temp ;
			
			buses[count]= new Bus(name, no, start, end, type, seatType, startTime, endTime, 
					dist, boarding, drop) ;
			
			System.out.println(name+" Bus added!");
			
			count++ ;
		}
		
		return true ;
		
		
	}
	
	public void searchBuses(String start, String end,String timing)
	{
		if (timing!="-") {
			
			for (int i = 0,j=0; i < count; i++) {
				
				if (buses[i].start==start && buses[i].end==end && 
						buses[i].startTime.substring(0, 2).equals(timing.substring(0, 2))) {
					
					if (startEndCount<=startEnd.length*0.7) {
						
						startEnd[j] = buses[i] ;
					}
					else
					{

						Bus []temp = new Bus[startEnd.length*2] ;
						
						for (int k = 0; k <count; k++) {
							
							temp[k] = startEnd[k] ;
						}
						
						startEnd= temp ;
						
						startEnd[j]= buses[i] ;
						
						
						
					}
					
					j++ ;
					
					startEndCount++ ;
				}
			}
		}
		else
		{
			for (int i = 0,j=0; i < count; i++) {
				
				if (buses[i].start==start && buses[i].end==end ) {
					
					if (startEndCount<=startEnd.length*0.7) {
						
						startEnd[j] = buses[i] ;
					}
					else
					{

						Bus []temp = new Bus[startEnd.length*2] ;
						
						for (int k = 0; k <count; k++) {
							
							temp[k] = startEnd[k] ;
						}
						
						startEnd= temp ;
						
						startEnd[j]= buses[i] ;
						
						
						
					}
					
					j++ ;
					
					startEndCount++ ;
				}
			}
		}
		
		if (startEndCount>0) {
			
			for (int i = 0; i <startEndCount; i++) {
				
				System.out.println(startEnd[i]);
			}
		}
		else
		{
			System.out.println("No buses found!");
		}
	}
	
	public void showBusDB()
	{
		for (int i = 0; i < count; i++) {
			
			System.out.println(buses[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
