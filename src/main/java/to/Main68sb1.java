package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main68sb1 {

    //二叉搜索树的最近公共组线
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }
}
