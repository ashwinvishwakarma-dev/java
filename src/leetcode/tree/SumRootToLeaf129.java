package leetcode.tree;

public class SumRootToLeaf129 {
	public static void main(String[] args) {
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(2);
		TreeNode root = new TreeNode(1, left, right);
		System.out.println(sumNumbers(root));
	}
	
	public static int sumNumbers(TreeNode root) {
		int current = 0;
		return dfs(root, current);
	}
	
	private static int dfs(TreeNode root, int current) {
		if (root == null) {
			return 0;
		}
		
		current = current * 10 + root.val;
		
		if (root.left == null && root.right == null) {
			return current;
		}
		int left = dfs(root.left, current);
		int right = dfs(root.right, current);
		
		return left + right;
	}
}
