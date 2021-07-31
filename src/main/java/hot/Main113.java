package hot;

import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main113 {

    private List<List<Integer>> res;
    private LinkedList<Integer> tmp;
    private int target;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new LinkedList<>();
        tmp=new LinkedList<>();
        this.target=targetSum;
        backTrace(root,0);
        return res;
    }

    private void backTrace(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum+=root.val;
        tmp.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==target){
                res.add(new LinkedList<>(tmp));
            }
        }
        backTrace(root.left, sum);
        tmp.removeLast();
        backTrace(root.right, sum);
        tmp.removeLast();
    }
}
