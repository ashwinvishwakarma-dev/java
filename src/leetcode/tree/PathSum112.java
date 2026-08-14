package leetcode.tree;

public class PathSum112 {
	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode root = new TreeNode(1, left, right);
		System.out.println(hasPathSum(null, 5));
	}
	
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		
		if (root == null) {
			return false;
		}
		
		if (root.left == null && root.right == null) {
			return targetSum == root.val;
		}
		
		int diff = targetSum - root.val;
		boolean left = hasPathSum(root.left, diff);
		boolean right = hasPathSum(root.right, diff);
		
		return left || right;
	}
}
