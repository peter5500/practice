package BST;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class treePath {
    /*
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
           public static void main(String[] args) {
               TreeNode root = new TreeNode(3);
               TreeNode p1 = new TreeNode(1);
               TreeNode p3 = new TreeNode(0);

               root.left = p1;
               p1.left = p3;

               System.out.println(binaryTreePaths(root));
           }
            public static List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        if (root == null){
            return paths;
        }
        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);
        for(String path:leftPaths){
            paths.add(root.val+"->"+path);
        }
        for(String path:rightPaths){
            paths.add(root.val+"->"+path);
        }
        if(paths.size() == 0){
            paths.add(Integer.toString(root.val)); //transfer type
        }
        return paths;
    }
}