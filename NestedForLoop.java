package week1.day2;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 2, 11, 15, 7, 3, 5, 4, 8, 1 };
		int target = 9; //find the sum of array values that gives 9
		
		for (int i = 0; i < nums.length; i++) {
			//System.out.println("i value "+i);
			for (int j = i+1; j < nums.length; j++) {
				//System.out.println("j value "+j);
				if ((nums[i]+nums[j])==target) {
					System.out.println(nums[i]);
					System.out.println(nums[j]);
					
				}
				
			}
		}
	}

}
