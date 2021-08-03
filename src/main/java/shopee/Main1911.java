package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1911 {
    public long maxAlternatingSum(int[] nums) {
            int n = nums.length;
            long even = nums[0], odd = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                long t1 = even, t2 = odd;
                even = Math.max(t1, Math.max(nums[i], t2 + nums[i]));
                odd = Math.max(t2, t1 - nums[i]);
            }
            return even;
    }
}
