package leetcode.interval;

import java.util.Arrays;

public class MinimumBurstBallon452 {
	public static void main(String[] args) {
		int[][] points = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
		System.out.println(findMinArrowShots(points));
	}
	
	public static int findMinArrowShots(int[][] points) {
		int count = 1;
		if (points.length == 0) {
			return 0;
		}
		Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
		int start1 = points[0][0];
		int end1 = points[0][1];
		
		for (int i = 1; i < points.length; i++) {
			int start2 = points[i][0];
			int end2 = points[i][1];
			
			if (end1 >= start2) {
				start1 = Math.max(start1, start2);
				end1 = Math.min(end1, end2);
			} else {
				count++;
				start1 = start2;
				end1 = end2;
			}
		}
		return count;
	}
}
