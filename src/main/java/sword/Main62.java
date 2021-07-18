package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main62 {

    public int lastRemaining(int n, int m) {
        int []dp=new int[n+1];
        dp[1]=0;
        for (int i = 2; i <=n; i++) {
            dp[i]=(dp[i-1]+m)%i;
        }
        return dp[n];
    }

    public int lastRemaining1(int n, int m) {
        int x=0;
        for (int i = 2; i <=n; i++) {
            x=(x+m)%i;
        }
        return x;
    }
}
