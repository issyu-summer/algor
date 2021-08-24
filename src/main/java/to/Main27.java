package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main27 {

    //二叉树的镜像
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode tmp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(tmp);
        return root;
    }

}
