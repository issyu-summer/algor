package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main64 {

    public int sumNums(int n) {
        boolean b=n>1&&(n+=sumNums(n-1))>0;
        return n;
    }
}
