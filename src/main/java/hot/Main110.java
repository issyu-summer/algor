package hot;

import com.sun.source.tree.Tree;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main110 {
    public boolean isBalanced(TreeNode root) {
        return root==null||
                (Math.abs((depth(root.right)-depth(root.left)))<=1
                        &&isBalanced(root.left)&&isBalanced(root.right));
    }

    private int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(depth(root.left),depth(root.right));
    }
}
