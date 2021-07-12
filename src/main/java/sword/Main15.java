package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main15 {

    /**
     * if（n&1=1）  最右一位是1
     */
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }

    public int hammingWeight1(int n) {
        int res=0;
        while(n!=0){
            res++;
            n&=n-1;
        }
        return res;
    }
}
