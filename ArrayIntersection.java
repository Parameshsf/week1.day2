package week1.day2;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * 
		 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
		 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
		 * a nested for another array from 0 to array length e) Compare Both the arrays
		 * using a condition statement
		 * 
		 * f) Print the first array (should match item in both arrays)
		 */

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		// Now compare these two array values in for loop and print the first array
		// which has matching values and then break the loop
		for (int i = 0; i < arr1.length;i++) {
			for (int j = 1; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])  {
				//	if ((arr1[i] == arr2[j]) && arr2[j] == 2) {
					System.out.println(
							"The values that are matching in arr1 and arr2 are :" + arr1[i] + " and " + arr2[j]);
					
					break;

				}

			}
			

		}

	}

}
