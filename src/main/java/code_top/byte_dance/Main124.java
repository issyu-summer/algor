package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main124 {

    int res;
    public int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        System.out.println(maxGain(root));
        return res;
    }
    private int  maxGain(TreeNode root) {
        //越过叶子节点,贡献为0
        if(root==null){
            return 0;
        }
        //递归计算左子树的最大贡献,比0大时才会选取节点
        int lGain=Math.max(maxGain(root.left),0);
        int rGain=Math.max(maxGain(root.right),0);
        //更新res
        res=Math.max(res,root.val+lGain+rGain);
        //返回根+max(左子树的贡献,右子树的贡献)
        return root.val+Math.max(lGain,rGain);
    }
}
