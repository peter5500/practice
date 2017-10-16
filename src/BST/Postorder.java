package BST;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Recursive
public class Postorder {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if (root == null){
            return list;
        }

        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }

}

//Iterative
class Postorder2{
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null;
        TreeNode curr = root;

        if (root == null) {
            return result;
        }

        stack.push(root);
        while (!stack.empty() ){
            curr = stack.peek();
            if (prev == null || prev.left != curr || prev.right != curr){
                if (curr.left != null){
                    stack.push(curr.left);
                }
                else if (curr.right != null){
                    stack.push(curr.right);
                }
            }
            else if (curr.left == prev){
                if (curr.right != null){
                    stack.push(curr.right);
                }
            }
            else {
                result.add(curr.val);
                stack.pop();
            }
            prev = curr;
        }
        return result;

}
