package BST;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null)
            return minDepth(root.right)+1;
        if(root.right == null)
            return minDepth(root.left)+1;

        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}


class MinDepth2 {
    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getmin(root);
    }

    public int getmin(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(getmin(root.left), getmin(root.right)) + 1;
    }
}
