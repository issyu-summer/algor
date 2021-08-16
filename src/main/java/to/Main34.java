package to;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main34 {

    List<List<Integer>> res;
    LinkedList<Integer> tmp;
    //二叉树中和为某一值的路径
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res=new ArrayList<>();
        tmp=new LinkedList<>();
        backTrace(root,target);
        return res;
    }

    //二叉树的递归或回溯不需要deep
    private void backTrace(TreeNode root,int target) {
        if(root==null){
            return;
        }
        tmp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(tmp);
        }
        backTrace(root.left,target);
        backTrace(root.right,target);
        tmp.removeLast();
    }
}
