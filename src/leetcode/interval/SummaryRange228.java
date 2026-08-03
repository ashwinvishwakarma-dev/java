package leetcode.interval;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange228 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 4, 5, 7};
		System.out.println(summaryRanges(nums));
	}
	
	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		
		int i = 0;
		
		while (i < nums.length) {
			int start = nums[i];
			
			while (i < nums.length - 1 && nums[i] == nums[i + 1]-1) {
				i++;
			}
			
			int end = nums[i];
			if (start == end) {
				list.add(String.valueOf(start));
			} else {
				list.add(String.valueOf(start + "->" + end));
			}
			i++;
		}
		
		return list;
	}
}
