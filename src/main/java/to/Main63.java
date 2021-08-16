package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main63 {

    public int maxProfit(int[] prices) {
        int len;
        if((len=prices.length)==0){
            return 0;
        }
        int res=Integer.MIN_VALUE,cost=Integer.MAX_VALUE;
        int price;
        for (int i = 0; i < len; i++) {
            cost=Math.min(cost,price=prices[i]);
            res=Math.max(res,price-cost);
        }
        return res;
    }
}
