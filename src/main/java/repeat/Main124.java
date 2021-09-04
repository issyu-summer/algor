package repeat;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main124 {

    int res;
    public int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        maxGain(root);
        return res;
    }

    private int maxGain(TreeNode root){
        if(root==null){
            return 0;
        }
        int lG=Math.max(maxGain(root.left),0);
        int rG=Math.max(maxGain(root.right),0);
        res=Math.max(res,root.val+lG+rG);
        return root.val+Math.max(lG,rG);
    }
}
