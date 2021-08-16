package sword;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main7 {

    private Map<Integer, Integer> dictIn;
    private int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.dictIn = new HashMap<>();
        this.preorder = preorder;
        //缓存中序：左根右
        for (int i = 0; i < inorder.length; i++) {
            dictIn.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);

    }

    public TreeNode recur(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        //前序遍历：根左右->首元素为根
        TreeNode node = new TreeNode(preorder[root]);
        //i:根在中序遍历中的位置
        int i = dictIn.get(preorder[root]);
        //root用在前序遍历==i,left和right用在中序遍历
        //root+1->左根的位置
        node.left = recur(root + 1, left, i - 1);
        //前序遍历根左右->左子树长度+root的位置+1->右根的位置
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
