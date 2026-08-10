package leetcode.stack;

import java.util.Stack;

public class ReversePolishNotation150 {
	public static void main(String[] args) {
		String[] tokens = {"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(tokens));
	}
	
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		
		for (String s : tokens) {
			
			if (s.equals("+")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b + a);
			} else if (s.equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
			} else if (s.equals("*")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b*a);
			} else if (s.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			} else {
				stack.push(Integer.parseInt(s));
			}
		}
		
		return stack.pop();
	}
}
