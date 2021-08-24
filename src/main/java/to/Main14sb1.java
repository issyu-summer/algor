package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main14sb1 {

    //剪绳子
    public int cuttingRope(int n) {
        if(n<4){
            return n-1;
        }
        if(n==4){
            return 4;
        }
        int res=1;
        while (n>4){
            res*=3;
            n-=3;
        }
        return res*n;
    }
}
