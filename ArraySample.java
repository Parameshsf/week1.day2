package week1.day2;

import java.util.Arrays;

public class ArraySample {

	public void arraySample() {
		// TODO Auto-generated method stub
		int[] arrNum = new int[7];
		int arrLength = arrNum.length;
		System.out.println("Array Length is " + arrLength);

		arrNum[0] = 10;
		arrNum[1] = 5;
		arrNum[2] = 30;
		arrNum[3] = 100;
		arrNum[4] = 8;
		arrNum[5] = 130;
		arrNum[6] = 120;
		// arrNum[7] = 60; You will get Index Out of Bound Exception since the defined
		// array can store only 0 to 6 index values

		for (int i = 0; i < arrLength; i++) {
			System.out.println("The values in array is as follows " + arrNum[i]);

		}

		// To sort in ascending order
		Arrays.sort(arrNum);
		System.out.println("After Array Sort has been done");
		for (int i = 0; i < arrLength; i++) {
			System.out.println("The values in array is as follows " + arrNum[i]);
		}
		System.out.println("The largest value in array after sorting would be " + arrNum[6]);
		System.out.println("The smallest value in array after sorting would be " + arrNum[0]);
		System.out.println("The Second largest value in array after sorting would be " + arrNum[arrLength - 2]);
		System.out.println("The Second Smallest value in array after sorting would be " + arrNum[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySample ar = new ArraySample();
		ar.arraySample();

	}

}
