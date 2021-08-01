package shopee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main145 {

    List<Integer> res;
    public List<Integer> postorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        recur(root);
        return res;
    }

    private void recur(TreeNode root){
        if(root==null){
            return;
        }
        recur(root.left);
        recur(root.right);
        res.add(root.val);
    }

}
