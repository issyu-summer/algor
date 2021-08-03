package hot;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main300 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[]dp=new int[len];
        int res=0;
        Arrays.fill(dp,1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
