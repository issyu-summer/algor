package sword;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main7 {

    private Map<Integer, Integer> dict;
    private int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.dict = new HashMap<>();
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dict.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);

    }

    public TreeNode recur(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        //根
        TreeNode node = new TreeNode(preorder[root]);
        //根的位置
        int i = dict.get(preorder[root]);
        //left和right限制了左右子树的长度和相应元素的位置
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(i - left + root + 1, i + 1, right);
        return node;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
