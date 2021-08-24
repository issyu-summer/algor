package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main16 {

    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        //用long代替int
        long b=n;
        if(b<0){
            b=-b;
            x=1.0/x;
        }
        return pow(x,b);
    }

    //快速幂
    private double pow(double x, long b) {
        double res=1.0;
        while (b>0){
            if((b&1)==1){
                res*=x;
            }
            x*=x;
            b>>=1;
        }
        return res;
    }
}
