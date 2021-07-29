package hot;/**
* @see <a href=""></a><br/>
* @author summer
*/
public class Main96 {
    public int numTrees(int n) {
        long t=1;
        for (int i = 0; i < n; i++) {
            t=t*2L*(2L *i+1)*t/(i+2L);
        }
        return (int) t;
    }

    public int numTrees1(int n) {
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
