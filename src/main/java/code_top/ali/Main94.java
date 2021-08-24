package code_top.ali;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main94 {

    //二叉树的中序遍历
    List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        recur(root);
        return res;
    }

    private void recur(TreeNode root) {
        if(root==null){
            return;
        }
        recur(root.left);
        res.add(root.val);
        recur(root.right);
    }
}
