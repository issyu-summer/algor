package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main65 {
    //不用加减乘除做加法
    public int add(int a, int b) {
        return b==0?a:add(a^b,(a&b)<<1);
    }
}
