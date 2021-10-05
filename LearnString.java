package week1.day2;

public class LearnString {
	
	public void learnStringFunctions() {
		// TODO Auto-generated method stub
		String strTest = "Welcome to TestLeaf"; //Literal declaration
		
		String str1 = new String("Hello World");//Object declaration 
		
		System.out.println(strTest);
		System.out.println(str1);
		
		//String Length
		int str1Length = str1.length();
		int str = strTest.length();
		System.out.println(str1Length);
		System.out.println(str);
		
		//Find a character in a string with position
		System.out.println(str1.charAt(5));
		
		//Get the position of a character in a string
		int indexOf = str1.indexOf('l');
		System.out.println("Index of L in a String"+indexOf);
		
		//Get the last position of a character in a String
		int lastIndexOf = str1.lastIndexOf('r');
		System.out.println("THe last index of character"+lastIndexOf);
		
		//Convert a String to Char Array
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"]: "+charArray[i]);
		}
		
		//Split a string to an array
		String[] split = str1.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("split array["+i+"] :"+split[i]);
		}
		
		//Get a part of the string using substring
		String substring = str1.substring(4);
		System.out.println("The substring value :"+substring);
		
		String substring2 = str1.substring(2, 8);
		System.out.println("The start and end of the substring value : "+substring2);
		
		//Replace a character
		
		String replace = str1.replace('o', 'O');
		System.out.println("The replaced character is :" + replace);
		
		//Print only the integers in a string
		String sample = "Hello World 1234";
		String showIntegers = sample.replaceAll("[\\D]", "");
		System.out.println("Displays only the integers from a string "+showIntegers);
		
		//print only the alphabets in a string
		
		String showAlphabets = sample.replaceAll("[\\d]", "");
		System.out.println("Displays only the alphabets from a string "+showAlphabets);
		
		//Compare two strings
		if (str1.equals(strTest)) {
			System.out.println("Both the strings str1 and strTest are equal");
			
		}
		else
		{
			System.out.println("Both the strings str1 and strTest are different");
		}
		
		//find the character occurrence of e letter
		int count = 0;
		char[] charOccurrence = strTest.toCharArray();
		for (int i = 0; i < charOccurrence.length; i++) {
			if (charOccurrence[i]=='e') {
				count = count + 1;
				
			}
			
		}
		System.out.println("The character occurrences of letter e is "+ count);
		
		//Change the odd index of the string to UpperCase
		//char[] convertToupperCase = strTest.toCharArray();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnString LS = new LearnString();
		LS.learnStringFunctions();
	}

}
