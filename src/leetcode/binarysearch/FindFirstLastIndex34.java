package leetcode.binarysearch;

import java.util.Arrays;

public class FindFirstLastIndex34 {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 2, 2, 3};
		int target = 11;
		
		int first = findFirst(nums, target);
		int last = findLast(nums, target);
		
		System.out.println(Arrays.toString(new int[]{first, last}));
	}
	
	public static int findFirst(int[] nums, int target) {
		
		int result = -1;
		int left = 0;
		int right = nums.length - 1;
		
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				result = mid;
				right = mid - 1;
			}
		}
		return result;
	}
	
	public static int findLast(int[] nums, int target) {
		
		int result = -1;
		int left = 0;
		int right = nums.length - 1;
		
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (nums[mid] < target) {
				left = mid + 1;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				result = mid;
				left = mid + 1;
			}
		}
		return result;
	}
}
