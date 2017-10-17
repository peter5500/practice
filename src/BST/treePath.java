package BST;

import java.util.ArrayList;
import java.util.List;

public class treePath {
    /*
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
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
            paths.add(Integer.toString(root.val));
        }
        return paths;
    }
}