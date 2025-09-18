package oops;

public class Gmail extends Google{
	int mails;
	int inbox;
	int sent;
	int bin;
	
	public Gmail()
	{
		
	}
	Gmail(String ceo,String hq,String turnover,String email,String pass)
	{
		this.ceo = ceo;
		this.hq = hq;
		this.turnover = turnover;
		this.email = email;
		this.pass = pass;
	}
	public void sendMail(String email,String content)
	{
		System.out.println("Mail sent!");
		sent++;
	}
	public void reciveMail(String email,String content)
	{
		System.out.println("Mail recived from"+email);
		System.out.println(content);
		inbox++;
		mails++;
	}
	public void deleteMail(String email) {
		mails--;
		bin++;
	}
	public void displayGmail()
	{
		System.out.println("Total mails: "+mails);
		System.out.println("Inbox: "+inbox);
		System.out.println("Sent Mails: "+sent);
		System.out.println("Deleted Mails: "+bin);
		System.out.println("_______________________");
	}
}
