package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main112 {
    private int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target=targetSum;
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode root, int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(root.left==null&&root.right==null) {
            if (sum == target) {
                return true;
            }
        }
        return dfs(root.left, sum) || dfs(root.right, sum);
    }
}
