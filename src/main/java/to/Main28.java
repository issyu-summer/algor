package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main28 {

    //对称的二叉树
    public boolean isSymmetric(TreeNode root) {
        return root==null||recur(root.left,root.right);
    }

    private boolean recur(TreeNode l,TreeNode r){
       if(l==null&&r==null){
           return true;
       }
       if(l==null||r==null){
           return false;
       }
       return l.val==r.val&&recur(l.left, r.right)&&recur(l.right,r.left);
    }
}
