package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main121 {

    public int maxProfit(int[] prices) {
        int cost=Integer.MAX_VALUE;
        int res=0;
        for (int price:prices) {
            cost=Math.min(cost,price);
            res=Math.max(res,price-cost);
        }
        return res;
    }
}
