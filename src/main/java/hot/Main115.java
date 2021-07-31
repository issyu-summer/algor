package hot;

import sword.Main38;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main115 {

    public int numDistinct(String s, String t) {
        int m=s.length(),n=t.length();
        if(m<n){
            return 0;
        }
        int [][]dp=new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][n]=1;
        }
        for (int i = m-1; i>= 0; i--) {
            char c = s.charAt(i);
            for (int j = n-1; j >=0; j--) {
                char c1 = t.charAt(j);
                if(c==c1){
                    dp[i][j]=dp[i+1][j+1]+dp[i+1][j];
                }else {
                    dp[i][j]=dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}
