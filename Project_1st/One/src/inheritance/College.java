package inheritance;

public class College extends University{
	
	String colName;
	String principal;
	String address;
	int collCode;
	int grade;
	
	int noOfDepts;

	public College() {
		// TODO Auto-generated constructor stub
	}
	
	public College(String uname,String vc,String uLoc,int code,String utype,
			String colName,String principal,String address,int collCode,
			int grade,int noOfDepts) {
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
		
	}
	
	public void displayCollege()
	{
		displayUniversity();
		System.out.println("College Name:	"+colName);
		System.out.println("Grade:	"+grade);
		System.out.println("Address:	"+address);
		System.out.println("Principal:	"+principal);
		System.out.println("No of Departements:");
		System.out.println("College code:	"+collCode);
		System.out.println("---------------------------");
	}

}
