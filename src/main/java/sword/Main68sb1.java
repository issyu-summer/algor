package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main68sb1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        while (root!=null){
            if(root.val<p.val&&root.val<q.val){
                root=root.right;
            }else if(root.val>p.val&&root.val>q.val){
                root=root.left;
            }else{
                break;
            }
        }
        return root;
    }
}
