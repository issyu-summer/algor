package dp;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">买卖股票的最佳时机II</a><br/>
 * 买之前必须先出售掉、（只要赚了就买即可）
 */
public class Main122 {
    public int maxProfit(int[] prices) {
        int res=0;
        int profit;
        for (int i = 1; i < prices.length; i++) {
            if((profit=prices[i]-prices[i-1])>0){
                res+=profit;
            }
        }
        return res;
    }
}
