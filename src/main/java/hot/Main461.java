package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main461 {

    public int hammingDistance(int x, int y) {
        int s=x^y;
        int res=0;
        while (s!=0){
            s&=s-1;
            res++;
        }
        return res;
    }
}
