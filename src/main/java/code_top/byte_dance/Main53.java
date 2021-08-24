package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main53 {

    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE/10;
        int dp=Integer.MIN_VALUE/10;
        for (int n:nums) {
            //如果前1个位负数,那么就选取当前的
            dp=Math.max(n,n+dp);
            //维护最大的
            res=Math.max(dp,res);
        }
        return res;
    }
}
