package DFS;

import java.util.ArrayList;

public class deSerialize {
    public TreeNode deserialize(String data) {
        if (data.equals("{}")) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        list.add(root);
        int index = 0;
        boolean isLeft = true;
        for (int i = 1; i < vals.length; i++) {
            if (vals[i] != "#") {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeft) {
                    list.get(index).left = node;
                } else {
                    list.get(index).right = node;
                }
                list.add(node);
            }
            if (!isLeft) {
                index++;
            }
            isLeft = !isLeft;

        }
        return root;
    }
}
