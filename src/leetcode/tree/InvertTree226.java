package leetcode.tree;

public class InvertTree226 {
	public static void main(String[] args) {
		
		TreeNode right1Left = new TreeNode(6);
		TreeNode right1Right = new TreeNode(9);
		TreeNode left1Left = new TreeNode(1);
		TreeNode left1Right = new TreeNode(3);
		TreeNode rootRight1 = new TreeNode(7, right1Left, right1Right);
		TreeNode rootLeft1 = new TreeNode(2, left1Left, left1Right);
		TreeNode root = new TreeNode(4, rootLeft1, rootRight1);
		
		System.out.println(invertTree(root));
		
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.right = left;
		root.left = right;
		
		return root;
	}
}
