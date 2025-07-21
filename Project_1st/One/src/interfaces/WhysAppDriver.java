package interfaces;

public class WhysAppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhysApp w1 = new WhysAppImp2("Rahul",97257938l);

		w1.message(987654321l, "Byee!!");
		w1.voiceMsg(987654321l, "Don't Reply");
		
		w1.status("Don't chat with 987654321");
	}

}
