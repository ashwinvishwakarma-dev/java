package leetcode.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class IPO502 {
	public static void main(String[] args) {
		int[] capital = {1, 1, 2};
		int[] profits = {1, 2, 3};
		int k = 10;
		int w = 0;
		
		System.out.println(findMaximizedCapital(k, w, profits, capital));
		
	}
	
	public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
		int n = capital.length;
		
		int[][] projects = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			projects[i][0] = capital[i];
			projects[i][1] = profits[i];
		}
		
		Arrays.sort(projects, (a, b) -> a[0] - b[0]);
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		int i = 0;
		
		for (int count = 0; count < k; count++) {
			
			while (i < n && projects[i][0] <= w) {
				queue.add(projects[i][1]);
				i++;
			}
			if (queue.isEmpty()) {
				break;
			}
			w = w + queue.poll();
		}
		return w;
	}
}
