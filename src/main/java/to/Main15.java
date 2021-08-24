package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main15 {

    //汉明重量,二进制中1的个数
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            n&=(n-1);
            res++;
        }
        return res;
    }

}
