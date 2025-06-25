package encapsulation;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("Raju","ICIC",9876543210l,"icici1234",
				30000.0,123456789l,"Pune",56781234l,1234,"Decan");
		
		b1.displayBankAccount();
		
		b1.setPin(123456789l,1234,1420);
	}

}
