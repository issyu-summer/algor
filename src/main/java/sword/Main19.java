package sword;

import java.util.regex.Matcher;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main19 {

    public boolean isMatch(String s, String p) {
        s=" "+s;
        p=" "+p;
        int sLen=s.length(),pLen=p.length();
        boolean [][]dp=new boolean[sLen][pLen];
        dp[0][0]=true;
        for (int j = 2; j < pLen; j+=2) {
            dp[0][j]=dp[0][j-2]&&p.charAt(j)=='*';
        }
        for (int i = 1; i < sLen; i++) {
            for (int j = 1; j < pLen; j++) {
                if(p.charAt(j)=='*'){
                    dp[i][j]=dp[i][j-2]|| (dp[i-1][j]&&(s.charAt(i)==p.charAt(j-1) ||p.charAt(j-1)=='.'));
                }else {
                    dp[i][j]=dp[i-1][j-1]&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.');
                }
            }
        }
        return dp[sLen-1][pLen-1];
    }
}
