package hot;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main300 {

    //最长递增子序列
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[]dp=new int[len];
        int res=0;
        Arrays.fill(dp,1);
        //i是后边
        for (int i = 0; i < len; i++) {
            //j<i,所以j在i前边
            for (int j = 0; j < i; j++) {
                //如果后边的比前边的大
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
