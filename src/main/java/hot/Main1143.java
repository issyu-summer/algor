package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        text1=" "+text1;
        text2=" "+text2;
        int l1=text1.length();
        int l2=text2.length();
        int [][]dp=new int[l1][l2];
        for (int i = 1; i <l1; i++) {
            char c1=text1.charAt(i);
            for (int j = 1; j <l2; j++) {
                char c2=text2.charAt(j);
                if(c1==c2){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[l1-1][l2-1];
    }

    public static void main(String[] args) {
        new Main1143().longestCommonSubsequence("abcde","acd");
    }
}
