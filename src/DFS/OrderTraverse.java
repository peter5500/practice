package DFS;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
         this.val = val;
          this.left = this.right = null;
      }
  }

public class OrderTraverse {
    /*
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List result = new ArrayList();

        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i=0; i<size; i++){
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null){
                    queue.offer(head.left);
                }
                if (head.right != null){
                    queue.offer(head.right);
                }
            }
            result.add(level);

        }
        return result;

    }
}
