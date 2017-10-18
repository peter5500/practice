package BST;

import java.util.Stack;

public class FlattenToList {
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            TreeNode node = stack.pop();
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }

            node.left = null;
            if (stack.empty()){
                node.right = null;
            }
            else{
                node.right = stack.peek();
            }

        }
    }
}
