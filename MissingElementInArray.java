package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the missing element in array
		int[] ind = { 1, 2, 3, 4, 7, 6, 8, 0 };
		Arrays.sort(ind);// First sort the array to sequence the number is ascending order that helps to
							// find the missing elements easily

		for (int i = 0; i < ind.length; i++) {
			if (ind[i] != i) {
				System.out.println("The missing element in array sequence is " + i);
				break;
				// System.out.println(ind[i]);

			}

		}

	}

}
