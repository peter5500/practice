package BST;

public class isBalance {
    public boolean isBalanced(TreeNode root){
        return check(root) != -1;
    }

    private int check(TreeNode root){
        if (root == null){
            return 0;
        }
        int right = check(root.left);
        int left = check(root.right);
        if (right == -1 || left == -1 || Math.abs(left - right)>1){
            return -1;
        }
        return Math.max(right,left)+1;
    }
}
