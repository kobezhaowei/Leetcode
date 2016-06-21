import javax.swing.tree.TreeNode;

/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

	

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
		
		public int maxDepth(TreeNode root) {

			if (root == null)
				return 0;
			else {
				int left = maxDepth(root.left);
				int right = maxDepth(root.right);
				return 1 + Math.max(left, right);
			}

		}
		
		
		
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		TreeNode left1 = new TreeNode(2);
		TreeNode left2 = new TreeNode(3);
		TreeNode right1 = new TreeNode(4);

		int Depth = maxDepth(root);;
	}

}
