package BST;


import java.util.ArrayList;
import java.util.List;

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

}
