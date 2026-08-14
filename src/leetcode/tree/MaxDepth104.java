package leetcode.tree;


public class MaxDepth104 {
	public static void main(String[] args) {
		
		TreeNode right1Left = new TreeNode(18);
		TreeNode right1Right = new TreeNode(7);
		TreeNode rootLeft1 = new TreeNode(9);
		TreeNode rootRight1 = new TreeNode(20, right1Left, right1Right);
		TreeNode root = new TreeNode(3, rootLeft1, rootRight1);
		
		System.out.println(maxDepth(root));
	}
	
	public static int maxDepth(TreeNode root) {
		
		if (root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return Math.max(left, right) + 1;
	}
}

