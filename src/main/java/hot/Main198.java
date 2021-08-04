package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main198 {

    public int rob(int[] nums) {
        int len=nums.length;
        int []dp=new int[len];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < len; i++) {
            //偷第K家则不能偷第k-1家,不偷第K家则可以偷第K-1家
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];
    }

    public int rob1(int[] nums) {
        int len=nums.length;
        if(len<=1){
            return nums[0];
        }
        int dp1,dp2;
        dp1=nums[0];
        dp2=Math.max(nums[0],nums[1]);
        for (int i = 2; i < len; i++) {
            int tmp=dp2;
            dp2=Math.max(dp1+nums[i],dp2);
            dp1=tmp;
        }
        return dp2;
    }
}
