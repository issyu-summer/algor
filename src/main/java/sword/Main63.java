package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main63 {

    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int []dp=new int[prices.length];
        int cost=prices[0];
        dp[0]=0;
        for (int i = 1; i < prices.length; i++) {
            //维护最小的花费
            cost=Math.min(cost,prices[i]);
            dp[i]= Math.max(dp[i-1],prices[i]-cost);
        }
        return dp[dp.length-1];
    }
}
