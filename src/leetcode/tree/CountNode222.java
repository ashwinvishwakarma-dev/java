package leetcode.tree;

public class CountNode222 {
	public static void main(String[] args) {
		TreeNode right1Left = new TreeNode(7);
//		TreeNode right1Right = new TreeNode(6);
		TreeNode left1Left = new TreeNode(5);
		TreeNode left1Right = new TreeNode(4);
		TreeNode rootRight1 = new TreeNode(3, right1Left, null);
		TreeNode rootLeft1 = new TreeNode(2, left1Left, left1Right);
		TreeNode root = new TreeNode(1, rootLeft1, rootRight1);
		
		System.out.println(countNodes(root));
	}
	
	public static int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int leftHeight = getLeftHeight(root);
		int rightHeight = getRightHeight(root);
		
		if (leftHeight == rightHeight) {
			return (1 << leftHeight) - 1;
		}
		
		int left = countNodes(root.left);
		int right = countNodes(root.right);
		return 1 + (left + right);
	}
	
	private static int getLeftHeight(TreeNode root) {
		int height = 0;
		
		while (root != null) {
			height++;
			root = root.left;
		}
		return height;
	}
	
	private static int getRightHeight(TreeNode root) {
		int height = 0;
		
		while (root != null) {
			height++;
			root = root.right;
		}
		return height;
	}
}
