package code_top.byte_dance;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/symmetric-tree/">101.对称二叉树</a><br/>
 * <strong>l.val==r.val&&recur(l.left,r.right)&&recur(l.right,r.left)
 */
public class Main101 {

    public boolean isSymmetric(TreeNode root) {
        return root==null||recur(root.left,root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return left.val==right.val&&recur(left.left,right.right)&&recur(left.right, right.left);
    }
}
