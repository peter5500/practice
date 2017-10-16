package BST;

//divide
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right)+1;
    }
}

//
class MaximumDepth2 {
    private int depth;

    public int maxDepth(TreeNode root) {
    depth = 0;
    helper(root,1);
    return depth;
}
private void helper(TreeNode node, int curdepth){
        if (node == null){
            return;
        }
        if (curdepth > depth){
            depth = curdepth;
        }

        helper(node.left,curdepth+1);
        helper(node.right,curdepth+1);
    }
}
