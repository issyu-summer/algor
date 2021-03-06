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
        dfs(root,target);
        return res;
    }

    private void dfs(TreeNode root, int target){
        if(root==null){
            return;
        }
        tmp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(tmp));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        tmp.remove(tmp.size()-1);
    }

    private void dfs1(TreeNode root, int target){
        if(root==null){
            return;
        }
        List<Integer> saved=new ArrayList<>(tmp);
        tmp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(tmp));
        }
        dfs1(root.left,target);
        dfs1(root.right,target);
        tmp=saved;
    }
}
