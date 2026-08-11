package leetcode.slidingwindow;

public class MinimumSubarraySum209 {
	public static void main(String[] args) {
		int target = 4;
		int[] nums = {1, 4, 4};
		
		System.out.println(minSubArrayLen(target, nums));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		int min = Integer.MAX_VALUE;
		int left = 0;
		int sum = 0;
		int right = 0;
		int len = nums.length - 1;
		while (right < len) {
			sum = sum + nums[right];
			while (sum >= target) {
				min = Math.min(min, (right - left) + 1);
				sum = sum - nums[left];
				left++;
			}
			right++;
		}
		if (min == Integer.MAX_VALUE) {
			return 0;
		}
		return min;
	}
}
