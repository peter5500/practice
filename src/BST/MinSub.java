package BST;

public class MinSub {
    public int subtreesum = Integer.MAX_VALUE;
    private TreeNode subtree = null;

    public TreeNode findSubtree(TreeNode root) {
        helper(root);
        return subtree;
    }
    private int helper(TreeNode root){
        if (root == null){
            return 0;
        }
        int sum = helper(root.left) + helper(root.right) + root.val;
        if (sum < subtreesum){
            subtreesum = sum;
            subtree = root;
        }
        return sum;
    }
}