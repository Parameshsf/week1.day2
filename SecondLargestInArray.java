package week1.day2;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		System.out.println("The second largest number in Array is");
		
		Arrays.sort(data);
		//int secondLargestNumber = data.length-2;
		System.out.println(data[data.length-2]);

	}

}
