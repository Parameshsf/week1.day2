package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the string in reverse order
		String str = "Feeling good";
		System.out.println("Print the given string '"+str+"' in Reverse Order");
		
		char[] cs = str.toCharArray();
		for (int i = cs.length-1; i > 0; i--) {
			System.out.print(cs[i]);
			
		}

	}

}
