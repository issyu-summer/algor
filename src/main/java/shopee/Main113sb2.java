package shopee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main113sb2 {
    List<List<Integer>> res;
    List<Integer> tmp;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new ArrayList<>();
        tmp=new ArrayList<>();
        backTrace(root,targetSum);
        return res;
    }

   private void backTrace(TreeNode root,int target){
        if(root==null){
            return;
        }
        target-=root.val;
        tmp.add(root.val);
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(tmp));
        }
        backTrace(root.left,target);
        backTrace(root.right,target);
        tmp.remove(tmp.size()-1);
   }
}
