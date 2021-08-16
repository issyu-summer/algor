package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main64 {

    //求1+2+...+n，不能使用乘除，for,while，if等
    public int sumNums(int n) {
        boolean b=n>1&&(n+sumNums(n-1))>0;
        return n;
    }
}
