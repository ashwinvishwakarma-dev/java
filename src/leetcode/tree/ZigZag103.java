package leetcode.tree;

import java.util.*;

public class ZigZag103 {
	public static void main(String[] args) {
		TreeNode right1Left = new TreeNode(15);
		TreeNode right1Right = new TreeNode(7);
		TreeNode rootLeft1 = new TreeNode(9);
		TreeNode rootRight1 = new TreeNode(20, right1Left, right1Right);
		TreeNode root = new TreeNode(3, rootLeft1, rootRight1);
		
		System.out.println(zigzagLevelOrder(root));
	}
	
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		boolean leftToRight = true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			while (size > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				size--;
			}
			if (!leftToRight) {
				Collections.reverse(list);
			}
			result.add(list);
			leftToRight = !leftToRight;
		}
		return result;
	}
}
