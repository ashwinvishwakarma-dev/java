package leetcode.heap;

import java.util.PriorityQueue;

public class KthLargest215 {
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;
		System.out.println(findKthLargest(nums,k));
	}
	
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			
			int min = queue.peek();
			if (i > k && nums[i] <= min) {
				continue;
			}
			queue.poll();
			queue.add(nums[i]);
			
		}
		
		return queue.peek();
	}
}
