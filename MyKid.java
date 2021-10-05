package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.sendMsg("Hello");
		// Not able to access the Private method from MyMobile class as it is restricted to that class
	}

}
