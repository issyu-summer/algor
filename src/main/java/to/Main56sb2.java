package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main56sb2 {

    //一个数字出现了1次,其他数字出现了三次
    public int singleNumber(int[] nums) {
        int one=0,two=0;
        for (int i:nums) {
            one=one^i&~two;
            two=two^i&~one;
        }
        return one;
    }
}
