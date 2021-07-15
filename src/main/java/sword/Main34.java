package sword;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main34 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<List<Integer>> res;
    private List<Integer> tmp;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res=new ArrayList<>();
        tmp=new ArrayList<>();
        backTrace(root,target);
        return res;
    }

    private void backTrace(TreeNode root,int target){
        if(root==null){
            return;
        }
        if(target==0&&root.left==null&&root.right==null){
            res.add(tmp);

        }
        tmp.add(root.val);
        target-=root.val;
        backTrace(root.left,target);
        backTrace(root.right,target);
        tmp.remove(root.val);
    }
}
