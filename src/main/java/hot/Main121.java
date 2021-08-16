package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main121 {

    public int maxProfit(int[] prices) {
        int count=Integer.MAX_VALUE;
        int res=0;
        for (int price:prices) {
            count=Math.min(count,price);
            res=Math.max(res,price-count);
        }
        return res;
    }
}
