package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main68sb2 {

    //二叉树的最近公共组线
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return root;
    }
}
