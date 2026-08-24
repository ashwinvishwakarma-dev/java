package leetcode.binarysearch;

public class FindPivotElement {
	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(findPivot(nums));
	}
	
	public static int findPivot(int[] nums) {
		int ans = -1;
		
		int left = 0;
		int right = nums.length - 1;
		int len = nums.length - 1;
		
		if (nums[left] < nums[right]) {
			return ans;
		}
		
		while (left <= right) {
			
			int mid = left + (right - left) / 2;
			
			if (nums[mid] > nums[len]) {
				ans = mid;
				left = mid + 1;
			} else if (nums[mid] < nums[left]) {
				right = mid - 1;
			} else {
				ans = mid;
				return ans;
			}
		}
		
		return ans;
	}
}
