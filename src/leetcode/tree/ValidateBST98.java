package leetcode.tree;

public class ValidateBST98 {
	
	static TreeNode prev = null;
	static boolean ans = true;
	
	public static void main(String[] args) {
		
		
		TreeNode rootLeft1 = new TreeNode(5);
		TreeNode rootRight1 = new TreeNode(4);
		TreeNode root = new TreeNode(3, rootLeft1, rootRight1);
		
		System.out.println(isValidBST(root));
	}
	
	public static boolean isValidBST(TreeNode root) {
		
		if (root == null) {
			return true;
		}

//		Left
		boolean left = isValidBST(root.left);
		
		if (!left) {
			return false;
		}
		
		// Current
		if (prev == null) {
			prev = root;
		} else {
			if (root.val <= prev.val) {
				ans = false;
			}
			prev = root;
		}

//		Right
		boolean right = isValidBST(root.right);
		
		if (!right) {
			return false;
		}
		
		return ans;
	}
}
