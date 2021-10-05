package week1.day2;

public class StringCharacterOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Chennai";
		//Find the character count of e in a string
		
		char[] cs = str.toCharArray(); //Converting a string variable in to a character array to find e
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]=='e') {
				count = count + 1;
				
			}
			
			
		}
		System.out.println("The Character count of e in the given string '"+str+"' is "+ count);
		

	}

}
