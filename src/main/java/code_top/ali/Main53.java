package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53 {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE/10;
        int sum=Integer.MIN_VALUE/10;
        for (int n:nums) {
            //不包含数字n的之前的数字的最大和
            sum=Math.max(n,n+sum);
            res=Math.max(res,sum);
        }
        return res;
    }
}
