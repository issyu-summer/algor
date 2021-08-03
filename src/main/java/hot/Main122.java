package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main122 {

    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[][] dp =new int[len][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[len-1][0];
    }

    public int maxProfit1(int[] prices) {
        int len=prices.length;
        int dp0=0,dp1=-prices[0];
        for (int price : prices) {
            dp0 = Math.max(dp0, dp1 + price);
            dp1 = Math.max(dp1, dp0 - price);
        }
        return dp0;
    }

    /**
     * 贪心,价格增加了就买
     */
    public int maxProfit2(int[] prices) {
        int len=prices.length;
        int res=0;
        for (int i = 1; i < len; i++) {
            if(prices[i]>prices[i-1]){
                res+=prices[i]-prices[i-1];
            }
        }
        return res;
    }
}
