package inheritance;

public class Departement extends College{
	
	String type;
	String hod;
	int lec;
	int noOfStudents;
	int seats;

	public Departement() {
		// TODO Auto-generated constructor stub
	}
	
	public Departement(String uname,String vc,String uLoc,int code,String utype,
			String colName,String principal,String address,int collCode,
			int grade,int noOfDepts,String type,String hod,int lec,
			int noOfStudents,int seats) {
		this.uname = uname;
		this.vc = vc;
		this.uLoc = uLoc;
		this.code = code;
		this.utype = utype;
		
		this.colName = colName;
		this.collCode = collCode;
		this.grade = grade;
		this.address = address;
		this.principal = principal;
		this.noOfDepts = noOfDepts;
		
		this.type = type;
		this.hod = hod;
		this.lec = lec;
		this.noOfStudents = noOfStudents;
		this.seats = seats;
	}
	
	public void displayDepartement()
	{
		displayCollege();
		System.out.println("Departement type:	"+type);
		System.out.println("HOD:	"+hod);
		System.out.println("No of Lectures:"+lec);
		System.out.println("Student Count:	"+noOfStudents);
		System.out.println("Seats:	"+seats);
	}

}
