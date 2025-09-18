package oops;

public class GoogleDrive extends Google{
	int photos;
	int videos;
	int docs;
	int audio;
	int bin;
	
	public GoogleDrive()
	{
		
	}
	GoogleDrive(String ceo,String hq,String turnover,String email,String pass)
	{
		this.ceo = ceo;
		this.hq = hq;
		this.turnover = turnover;
		this.email = email;
		this.pass = pass;
	}
	
	public void displayDrive()
	{
		System.out.println("Photos :"+photos);
		System.out.println("Videos :"+videos);
		System.out.println("Documents :"+docs);
		System.out.println("Audios :"+audio);
		System.out.println("Bin :"+bin);
	}
}
