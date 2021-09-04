package code_top.byte_dance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main199 {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res=new ArrayList<>();
        recur(root,0);
        return res;
    }

    //右视图，recur(root,deep)
    private void recur(TreeNode root,int deep){
        if(root==null){
            return;
        }
        if(deep==res.size()){
            res.add(root.val);
        }
        recur(root.right,deep+1);
        recur(root.left,deep+1);
    }
}
