package leetcode.tree;

public class KthSmallest230 {
	static int count = 0;
	
	public static void main(String[] args) {
		TreeNode rootLeft1 = new TreeNode(1);
		TreeNode rootRight1 = new TreeNode(5);
		TreeNode root = new TreeNode(2, rootLeft1, rootRight1);
		
		System.out.println(kthSmallest(root, 4));
	}
	
	public static int kthSmallest(TreeNode root, int k) {
		int num = inorder(root, k);
		return num;
	}
	
	private static int inorder(TreeNode root, int k) {
		
		if (root == null) {
			return -1;
		}
		
		int left = inorder(root.left, k);
		
		if (left != -1) {
			return left;
		}
		count++;
		
		if (count == k) {
			return root.val;
		}
		
		int right = inorder(root.right, k);
		
		return right;
		
	}
}
