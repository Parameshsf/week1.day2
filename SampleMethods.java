package week1.day2;

public class SampleMethods {
	
	public void printMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is a Test Method");

	}
	
	public int addMethod() {
		int a = 10;
		int b = 20;
		int total = a+b;
		return total;
	}

	public static void main(String[] args) {
		SampleMethods obj = new SampleMethods();
		obj.printMethod();
		int addResult = obj.addMethod();
		System.out.println("The total of 2 variables are :"+addResult);
	}

}
