package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main49 {

    public int nthUglyNumber(int n) {
        int a=0,b=0,c=0;
        int []dp=new int[n];
        dp[0]=1;int n2,n3,n5;
        for (int i = 1; i < n; i++) {
            dp[i]=Math.min((n2=dp[a]*2),Math.min((n3=dp[b]*3),(n5=dp[c]*5)));
            if(dp[i]==n2){
                a++;
            }
            if(dp[i]==n3){
                b++;
            }
            if(dp[i]==n5){
                c++;
            }
        }
        return dp[n-1];
    }
}
