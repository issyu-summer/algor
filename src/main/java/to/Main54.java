package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main54 {

    int k;
    int res;

    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        recur(root);
        return res;
    }
    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        recur(root.right);
        if(--k==0){
            res=root.val;
        }
        recur(root.left);
    }
}
