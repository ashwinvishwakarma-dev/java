package leetcode.tree;

public class Symmetric101 {
	public static void main(String[] args) {
		TreeNode right1Left = new TreeNode(4);
		TreeNode right1Right = new TreeNode(3);
		TreeNode left1Left = new TreeNode(4);
		TreeNode left1Right = new TreeNode(3);
		TreeNode rootRight1 = new TreeNode(4, right1Left, right1Right);
		TreeNode rootLeft1 = new TreeNode(2, left1Left, left1Right);
		TreeNode root = new TreeNode(1, rootLeft1, rootRight1);
		
		System.out.println(isSymmetric(root));
	}
	
	public static boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		return isMirror(root.left, root.right);
	}
	
	private static boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		
		if (left.val !=right.val){
			return false;
		}
		
		boolean leftWithRight = isMirror(left.left,right.right);
		boolean rightWithLeft = isMirror(left.right,right.left);
		
		return leftWithRight && rightWithLeft;
	}
}
