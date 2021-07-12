package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main16 {

    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }else if(n<0){
            n=-n;
            return 1.0/pow(x,n);
        }else {
            return pow(x,n);
        }
    }

    private double pow(double x,int tmp){
        double res=1;
        while (tmp!=0){
            res*=x;
            tmp--;
        }
        return res;
    }
}
