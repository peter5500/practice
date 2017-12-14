package BST;

// traverse+Div
public class MinSub {
    public TreeNode subtree = null;
    public int treeSum = Integer.MAX_VALUE;

    public TreeNode findSub(TreeNode root){
        helper(root);
        return subtree;
    }

    public int helper(TreeNode root){
        if (root == null){
            return 0;
        }
        int sum = root.val + helper(root.left) + helper(root.right);
        if (sum < treeSum){
            treeSum = sum;
            subtree = root;
        }
        return treeSum;
    }
}

