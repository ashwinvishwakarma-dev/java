package leetcode.kadane;

public class MaximumSubarray53 {
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		for (int current : nums) {
			currentSum = currentSum + current;
			currentSum = Math.max(current, currentSum);
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}
}
