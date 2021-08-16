package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main55sb1 {

    //二叉树的深度
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.right),maxDepth(root.left));
    }
}
