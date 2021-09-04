package code_top.byte_dance;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/path-sum/">112.路径综合</a><br/>
 * 回溯
 */
public class Main112 {

    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target=targetSum;
        return backTrace(root);
    }

    private boolean backTrace(TreeNode root) {
        if(root==null){
            return false;
        }
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            return true;
        }
        boolean b= backTrace(root.left)||backTrace(root.right);
        target+=root.val;
        return b;
    }

}
