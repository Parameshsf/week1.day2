package week1.day2;

import week1.day1.IfCondition;

public class StringFindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		
		System.out.println("Find the count of letter,space,number and special character in a given string");
		
		int letter = 0;
		int space = 0;
		int digit = 0;
		int specialChar = 0;
		
		char[] cs = str.toCharArray();
		//traverse through the character array to find the types of string
		for (int i = 0; i < cs.length; i++) {
			if(Character.isLetter(cs[i])) {
				letter = letter + 1;
			}
			else if(Character.isDigit(cs[i])) {
				digit = digit + 1;
			}
			else if(Character.isSpaceChar(cs[i])) {
				space = space + 1;
			}
			else {
				specialChar = specialChar + 1;
			}
						
		}
		System.out.println("The letter count is: "+letter);
		System.out.println("The space count is: "+space);
		System.out.println("The digit count is: "+digit);
		System.out.println("The special character count is: "+specialChar);

	}

}
