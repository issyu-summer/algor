package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main16 {

    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        long b=n;
        if(b<0){
            b=-b;
            x=1.0/x;
        }
        return pow(x,b);
    }

    private double pow(double x,long n){
        double res=1.0;
        while(n>0){
            if((n&1)==1){
                res*=x;
            }
            x*=x;
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        new Main16().myPow(2.00000,
                -2147483648);
    }
}
