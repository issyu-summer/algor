package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main309 {

    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[][] dp = new int[len][3];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        dp[0][2]=0;
        for (int i = 1; i < len; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);
            dp[i][1]=dp[i-1][0]+prices[i];
            dp[i][2]=Math.max(dp[i-1][1],dp[i-1][2]);
        }
        return Math.max(dp[len-1][1],dp[len-1][2]);
    }
}
