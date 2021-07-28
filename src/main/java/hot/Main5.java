package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main5 {

    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int len=s.length();
        int begin=0,maxLen=0;
        boolean[][] dp =new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i]=true;
        }
        for (int l = 2; l <= s.length(); l++) {
            for (int i = 0; i < s.length(); i++) {
                int j=l+i-1;
                if (j >= len) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j]= false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j]&&maxLen<j-i+1){
                    begin=i;
                    maxLen=j-i+1;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    public static void main(String[] args) {
        String cbbd = new Main5().longestPalindrome("aaaa");
        System.out.println(cbbd);
    }
}
