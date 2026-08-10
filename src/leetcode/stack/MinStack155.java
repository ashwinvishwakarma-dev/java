package leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack155 {
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(3);
		minStack.push(4);
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}
}

class MinStack {
	
	Stack<Integer> stack;
	Stack<Integer> minStack;
	
	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}
	
	public void push(int value) {
		stack.push(value);
		
		if (minStack.isEmpty()) {
			minStack.push(value);
		} else {
			minStack.push(Math.min(value, minStack.peek()));
		}
	}
	
	public void pop() {
		stack.pop();
		minStack.pop();
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}
}

class MinStackWithList {
	List<Integer> list;
	List<Integer> minList;
	
	public MinStackWithList() {
		list = new ArrayList<>();
		minList = new ArrayList<>();
	}
	
	public void push(int value) {
		
		list.add(value);
		
		if (minList.isEmpty()) {
			minList.add(value);
		} else {
			int currentMin = minList.get(minList.size() - 1);
			minList.add(Math.min(value, currentMin));
		}
	}
	
	public void pop() {
		
		list.remove(list.size() - 1);
		minList.remove(minList.size() - 1);
	}
	
	public int top() {
		
		return list.get(list.size() - 1);
	}
	
	public int getMin() {
		
		return minList.get(minList.size() - 1);
	}
}
