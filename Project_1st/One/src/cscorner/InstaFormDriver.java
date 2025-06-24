package cscorner;

public class InstaFormDriver {
	public static void main (String[]args)
	{
		InstaForm i1 = new InstaForm("abhayxxmm1",123l,"stick@gmail.com","1234");
		i1.displayInstaForm();
		
		InstaForm i2 = new InstaForm("abhayxxmm1","stick@gmail.com");
		i2.displayInstaForm();
		
		InstaForm i4 = new InstaForm(9087654321l,"8900");
		i4.displayInstaForm();
		
		InstaForm i3 = new InstaForm("raju@gmail.com",null,"8900");
		i3.displayInstaForm();
		
		InstaForm i5 = new InstaForm(0,"rani@gmail.com","8900");
		i5.displayInstaForm();
	}
}
