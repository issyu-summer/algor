package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main121 {
    public int maxProfit(int[] prices) {
        int res=Integer.MIN_VALUE,cost=Integer.MAX_VALUE;
        for (int price:prices) {
            cost=Math.min(cost,price);
            res=Math.max(res,price-cost);
        }
        return res;
    }
}
