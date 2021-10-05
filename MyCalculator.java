package week1.day2;

public class MyCalculator {
	//This is the Main Class to call methods from a Class Calculator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an instance for Calculator class in this call to access its methods
		
		Calculator cal = new Calculator();
		
		System.out.println("Result of addition method from Calculator Class :"+cal.addition(15,20,10));
		System.out.println("Result of subtraction method from Calculator Class :"+cal.subtraction(30, 20));
		System.out.println("Result of multiplication method from Calculator Class :"+cal.multiply(18, 18));
		System.out.println("Result of division method from Calculator Class :"+cal.division(17, 4));
		
	}
	

}
