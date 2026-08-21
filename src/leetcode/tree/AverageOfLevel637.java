package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevel637 {
	public static void main(String[] args) {
		TreeNode right1Left = new TreeNode(18);
		TreeNode right1Right = new TreeNode(7);
		TreeNode rootLeft1 = new TreeNode(9);
		TreeNode rootRight1 = new TreeNode(20, right1Left, right1Right);
		TreeNode root = new TreeNode(3, rootLeft1, rootRight1);
		
		System.out.println(averageOfLevels(root));
	}
	
	public static List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			int size = queue.size();
			double total = 0;
			
			for (int i = 0; i < size; i++) {
				
				TreeNode node = queue.poll();
				
				total = total + node.val;
				
				if (node.left != null) {
					queue.add(node.left);
				}
				
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			list.add((double) total / size);
		}
		
		return list;
	}
}
