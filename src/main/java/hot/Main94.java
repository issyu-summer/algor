package hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main94 {

    private List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        recur(root);
        return res;
    }

    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        recur(root.left);
        res.add(root.val);
        recur(root.right);
    }
}
