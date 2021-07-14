package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main28 {
    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        return root==null||recur(root.left,root.right);
    }

    //跟子树类似
    private boolean recur(TreeNode l,TreeNode r){
        if(l==null&&r==null){
            return true;
        }
        if(l==null||r==null){
            return false;
        }
        return l.val==r.val&&recur(l.left,r.right)&&recur(l.right,r.left);
    }
}
