package leetcode.stack;

import java.util.Stack;

public class SimplifyPath71 {
	public static void main(String[] args) {
		String path = "/home/";
		System.out.println(simplifyPath(path));
	}
	
		public static String simplifyPath(String path) {
			Stack<String> stack = new Stack<>();
			
			String[] strArr = path.split("/");
			
			for (String str : strArr) {
				if (str.isEmpty()||str.equals(".")) {
					continue;
				}
				if (str.equals("..")) {
					if (!stack.isEmpty()) {
						stack.pop();
					}
				}else {
					stack.push(str);
				}
			}
			
			if (stack.isEmpty()) {
				return "/";
			}
			
			StringBuilder ans = new StringBuilder();
			
			for (String s : stack) {
				ans.append("/");
				ans.append(s);
			}
			return ans.toString();
			
		}
}
