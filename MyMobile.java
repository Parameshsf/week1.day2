package week1.day2;

public class MyMobile {

	String Brand = "Oppo";
	String Model = "K3";
	int Price = 18000;

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Mobile has been called");

	}

	public void sendMsg(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);

	}

	private void payBills() {
		// TODO Auto-generated method stub
		System.out.println("The bills have been paid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile mB = new MyMobile();
		System.out.println("The Brand: " + mB.Brand);
		System.out.println("The Model: " + mB.Model);
		System.out.println("The Price: " + mB.Price);
		mB.makeCall();
		mB.sendMsg("Welcome to Oppo K3");
		mB.payBills();
	}

}
