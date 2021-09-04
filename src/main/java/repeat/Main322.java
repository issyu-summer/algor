package repeat;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href="public int coinChange(int[] coins, int amount) {">零钱兑换</a><br/>
 * dp[i]组成金额i的最少数量
 */
public class Main322 {
    public int coinChange(int[] coins, int amount) {
        int []dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for (int i = 0; i <=amount; i++) {
            for (int coin:coins) {
                if(coin<=i){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
