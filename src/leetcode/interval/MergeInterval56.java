package leetcode.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval56 {
	public static void main(String[] args) {
		int[][] intervals = {{1, 5}, {10, 15}, {20, 25}, {4, 6}};
		System.out.println(Arrays.deepToString(merge(intervals)));
	}
	
	public static int[][] merge(int[][] intervals) {
		
		List<int[]> result = new ArrayList<>();
		
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		
		int start1 = intervals[0][0];
		int end1 = intervals[0][1];
		
		for (int i = 1; i < intervals.length; i++) {
			int start2 = intervals[i][0];
			int end2 = intervals[i][1];
			
			if (end1 >= start2) {
				end1 = Math.max(end1, end2);
			} else {
				result.add(new int[]{start1, end1});
				start1 = start2;
				end1 = end2;
			}
		}
		result.add(new int[]{start1, end1});
		
		return result.toArray(new int[result.size()][]);
	}
}
