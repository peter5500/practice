package BST;

public class LCA {
    public TreeNode LCA(TreeNode root, TreeNode A, TreeNode B){
        if (root == null || root == A || root == B){
            return root;
        }
        TreeNode left = LCA(root.left,A,B);
        TreeNode right = LCA(root.right,A,B);

        if ( left != null && right != null){
            return root;
        }
        if (right != null){
            return right;
        }
        if (left != null){
            return left;
        }
        return null;
    }
}
