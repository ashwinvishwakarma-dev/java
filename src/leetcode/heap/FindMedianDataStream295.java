package leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianDataStream295 {
	public static void main(String[] args) {
		MedianFinder medianFinder = new MedianFinder();
		
		medianFinder.addNum(1);
		medianFinder.addNum(2);
		medianFinder.addNum(3);
		medianFinder.addNum(4);
		medianFinder.findMedian();
		System.out.println(medianFinder.findMedian());
	}
}

class MedianFinder {
	
	PriorityQueue<Integer> left;
	PriorityQueue<Integer> right;
	
	public MedianFinder() {
		left = new PriorityQueue<>(Collections.reverseOrder());
		right = new PriorityQueue<>();
	}
	
	public void addNum(int num) {
		left.add(num);
		
		if (!right.isEmpty() && left.peek() > right.peek()) {
			left.add(right.poll());
			right.add(left.poll());
		}
		if (left.size() - 1 > right.size()) {
			right.add(left.poll());
		}
		
	}
	
	public double findMedian() {
		
		if (left.isEmpty() && right.isEmpty()) {
			return 0.0;
		}
		
		if (left.size() == right.size()) {
			return (left.peek() + right.peek()) / 2.0;
		}
		return left.peek();
	}
}

