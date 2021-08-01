package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main136 {

    //136只出现一次的数字,异或
    public int singleNumber(int[] nums) {
        int i=0;
        for (int n:nums) {
            i^=n;
        }
        return i;
    }
}
