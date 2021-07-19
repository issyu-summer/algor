package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main65 {
    public int add(int a,int b){
        return b==0?a:add(a^b,(a&b)<<1);
    }
}
