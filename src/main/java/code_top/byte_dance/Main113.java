package code_top.byte_dance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/path-sum-ii/">113.路径总和2</a><br/>
 * 回溯
 */
public class Main113 {
    int target;
    List<List<Integer>> res;
    List<Integer> tmp;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        target=targetSum;
        res=new ArrayList<>();
        tmp=new ArrayList<>();
        backTrace(root);
        return res;
    }

    private void backTrace(TreeNode root) {
        if(root==null){
            return;
        }
        tmp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(tmp));
        }
        backTrace(root.left);
        backTrace(root.right);
        tmp.remove(tmp.size()-1);
        target+=root.val;
    }

}
