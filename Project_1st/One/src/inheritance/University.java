package inheritance;

public class University {
	
	String uname;
	String vc;
	String uLoc;
	int code;
	String utype;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(String uname,String vc,String uLoc,int code,String utype) {
		this.uname = uname;
		this.vc = vc;
		this.uLoc = uLoc;
		this.code = code;
		this.utype = utype;
	}
	
	public void displayUniversity()
	{
		System.out.println("University Name:	"+uname);
		System.out.println("Vice-Chancellor:	"+vc);
		System.out.println("University Location:	"+uLoc);
		System.out.println("University Code:	"+code);
		System.out.println("University type:	"+utype);
		System.out.println("---------------------------");
	}
}
