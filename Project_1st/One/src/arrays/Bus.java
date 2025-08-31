package arrays;


import java.util.Arrays;
import java.util.Scanner;


public class Bus {

	String name ;
	String no ;
	String start ;
	String end ;
	String type ;
	String seatType ;
	String startTime ;
	String endTime ;
	int dist ;
	String [] boarding ;
	String [] drop ;
	
	User[][] seats = new User[10][4] ;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Bus(String name, String no, String start, String end, String type, 
			String seatType, String startTime,
			String endTime, int dist, String[] boarding, String[] drop) {
		super();
		this.name = name;
		this.no = no;
		this.start = start;
		this.end = end;
		this.type = type;
		this.seatType = seatType;
		this.startTime = startTime;
		this.endTime = endTime;
		this.dist = dist;
		this.boarding = boarding;
		this.drop = drop;
		
		System.out.println("Bus Registered!");
	}



	public void showSeats()
	{
		System.out.println("---------------------------------------");
		for (int i = 0; i < seats.length; i++) {
			
			for (int j = 0; j < seats[i].length; j+=2) {
				
				System.out.print(seats[i][j]+","+seats[i][j+1]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
	}
	
	public void displayBus()
	{
		System.out.println("Name: "+name);
		System.out.println("Route: "+start+" to "+end);
		System.out.println("Boarding Points: "+Arrays.toString(boarding));
		System.out.println("Drop Off Points: "+Arrays.toString(drop));
		System.out.println("Bus No: "+no);
		System.out.println("----------------------------------------------------");
		
	}
	
	public void bookSeat(String name, int age, char gen, long phno, 
			String boarding,String dest, String email,char row, int seatNo,
			int noOfSeats)
	{
		
		showSeats();
		int i = row-65;
		int j = seatNo-1 ;
		if (noOfSeats==1) {
			
			
			if (row>='A'&&row<='J' && seatNo>0 && seatNo<=4) {
				
				if (seats[i][j]==null) {
					
					if (j%2==0 && seats[i][j+1]==null  || j%2!=0 && seats[i][j-1]==null) {
						
						if (checkStartPoints(boarding)&&checkDropPoints(dest)) {
							
							reserveSeats(i, j, name, age, gen, phno, boarding, dest, email);
						}
						else
						{
							System.out.println("Invalid start and drop point");
						}
					}
					else if (j%2==0 && seats[i][j+1].gen==gen || j%2!=0 && seats[i][j-1].gen==gen) {
						
						if (checkStartPoints(boarding)&&checkDropPoints(dest)) {
							
							
							reserveSeats(i, j, name, age, gen, phno, boarding, dest, email);
							
						}
						else
						{
							System.out.println("Invalid start and drop point");
						}
					}
					else
					{
						if (gen=='M') {
							
							System.out.println("This seat is reserved for female!");
						}
						else
						{
							System.out.println("This seat is reserved for male!");
						}
					}
					
				}
				else
				{
					System.out.println("Seat already booked!");
				}
			}
			else
			{
				System.out.println("Invalid seat info!");
			}
		}
		else if (noOfSeats>1 && noOfSeats<=2) {
			
			Scanner sc = new Scanner(System.in) ;
			
			System.out.println("Enter the second travellers details:  ");
			System.out.println("Enter the name: ");
			String name2 = sc.nextLine() ;
			
			System.out.println("Enter the age: ");
			int age2 = sc.nextInt() ;
			
			System.out.println("Enter the phno: ");
			long phno2 = sc.nextLong() ;
			
			System.out.println("Enter the gender: ");
			
			char gen2 = sc.next().charAt(0) ;
			
			System.out.println("Enter email ID: ");
			
			String email2 = sc.next() ;
			
			System.out.println("Enter the row: ");
			
			char row2 = sc.next().charAt(0) ;
			
			System.out.println("Enter the seat No: ");
			
			int seatNo2 = sc.nextInt() ;
			
			if ((row2>='A' && row2<='J') && seatNo2>0 && seatNo2<=4) {
				
				int i2 = row2-65 ;
				
				int j2 = seatNo2-1 ;
				
				if ((i==i2 && j%2==0 && j2 == j+1 && seats[i][j]==null && 
						seats[i2][j2]==null)||(i==i2 && j%2!=0 && j2==j-1 && 
						seats[i][j]==null && seats[i2][j2]==null)) {
					
					if (checkStartPoints(boarding)&&checkDropPoints(dest)) {
						
						reserveSeats(i, j, name ,age, gen, phno, boarding, dest, email);
						
						reserveSeats(i2, j2, name2, age2, gen2, phno2, boarding, dest, email2);
					}
					else
					{
						System.out.println("Invalid start and drop point");
					}
				}
				else if (j%2==0 && seats[i][j+1]==null || j%2!=0 && seats[i][j-1]==null) {
					
				
					if (checkStartPoints(boarding)&&checkDropPoints(dest)) {
						
						seats[i][j] = new User(name, age, gen, phno, 
								boarding, dest, email);
						
						System.out.println(name+" Seat Booked!");
						
						if (j2%2==0 && seats[i2][j2+1]==null || j2%2!=0 && seats[i2][j2-1]==null) {
							reserveSeats(i2, j2, name2, age2, gen2, phno2, boarding, dest, email2);
						}
					
						
				}
				
					
					
				}
				else if (j%2==0 && seats[i][j+1].gen==gen || j%2!=0 && seats[i][j-1].gen==gen) {
					
					if (checkStartPoints(boarding)&&checkDropPoints(dest)) {
						
						reserveSeats(i,j, name, age, gen, phno, boarding, dest, email2);
						
						if (j2%2==0 && seats[i2][j2+1]==null || j2%2!=0 && seats[i2][j2-1]==null) {
							
							reserveSeats(i2, j2, name2, age2, gen2, phno2, boarding, dest, email2);
							
						}
					
						else if (j2%2==0 && seats[i2][j2+1]!=null && seats[i2][j2+1].gen==gen || j2%2!=0 && 
								seats[i2][j2-1]!=null &&seats[i2][j2-1].gen==gen) {
							
		
							reserveSeats(i2, j2, name2, age2, gen2, phno2, boarding, dest, email2);
							
							
						}
						else
						{
							if (gen=='M') {
								
								System.out.println(name2+" seat could not be booked");
								System.out.println("This seat is reserved for female!");
							}
							else
							{
								System.out.println(name2+" seat could not be booked");
								System.out.println("This seat is reserved for male!");
							}
						}
					
					
					}
					else
					{
						System.out.println("Invalid start and drop point");
					}
				}
				else
				{
					if (gen=='M') {
						
						System.out.println(name+" seat could not be booked");
						System.out.println("This seat is reserved for female!");
					}
					else
					{
						System.out.println(name+" seat could not be booked");
						System.out.println("This seat is reserved for male!");
					}
				}
			}
			
		}
		
	}
	
	public boolean checkStartPoints(String boarding)
	{
		for (int i = 0; i < this.boarding.length; i++) {
			
			if (this.boarding[i].equals(boarding)) {
				
				return true ;
			}
		}
		
		return false ;
	}
	
	public boolean checkDropPoints(String drop)
	{
		for (int i = 0; i < this.drop.length; i++) {
			
			if (this.drop[i].equals(drop)) {
				
				return true ;
			}
		}
		
		return false ;
	}
	
	private void reserveSeats(int row, int column,String name, int age, char gen, long phno, 
			String boarding,
			String dest, String email)
	
	{
		seats[row][column] = new User(name, age, gen, phno, 
				boarding, dest, email);
		
		System.out.println(name+" Seat Booked!");
	}
	
	public String toString()
	{
		return "[Name: "+name+", Bus Number: "+no+", Starting: "+start+", Destination: "+end+", Timing: "+startTime+"]" ;
	}
	
	public boolean equals(Object o)
	{
		return this.no.equals(((Bus)o).no) ;
	}
	
	public int hashCode()
	{
		return no.hashCode() ;
	}
}