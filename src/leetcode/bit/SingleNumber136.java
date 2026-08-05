package leetcode.bit;

public class SingleNumber136 {
	public static void main(String[] args) {
		int[] nums = {4, 1, 2, 2, 1};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		int num = 0;
		
		for (int i = 0; i < nums.length; i++) {
			num = num ^ nums[i];
		}
		return num;
	}
}
