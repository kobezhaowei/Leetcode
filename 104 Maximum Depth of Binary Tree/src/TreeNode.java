
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		TreeNode left1 = new TreeNode(2);
		TreeNode left2 = new TreeNode(3);
		TreeNode right1 = new TreeNode(4);

		TreeNode tree = new TreeNode(3);
		System.out.println(tree.maxDepth(root));

	}

}
