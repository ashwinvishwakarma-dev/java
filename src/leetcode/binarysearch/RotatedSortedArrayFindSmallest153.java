package leetcode.binarysearch;

public class RotatedSortedArrayFindSmallest153 {
	public static void main(String[] args) {
		
		int[] nums = {3, 1, 2};
		
		System.out.println(findMin(nums));
		
	}
	
	public static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;

//			Check
			if (nums[mid] >= nums[left]) {
				if (nums[mid] > nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if (nums[mid] < nums[right]) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}
		}
		return nums[left];
	}
	
	public static int findMinOptimized(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			
			int mid = left + (right - left) / 2;
			
			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		
		return nums[left];
	}
}

