package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main55sb2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
         return root==null||(Math.abs(depth(root.left)-depth(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right));
    }

    private int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}
