package code_top.byte_dance;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/longest-palindromic-substring/">5最长的回文子串</a><br/>
 * 枚举长度+动态规划
 */
public class Main5 {

    public String longestPalindrome(String s) {
        int len;
        if((len=s.length())<=1){
            return s;
        }
        int begin=0,maxLen=0;
        boolean [][]dp=new boolean[len][len];
        for (int l = 1; l <= len; l++) {
            for (int i = 0; i < len; i++) {
                int j=l+i-1;
                if(j>=len){
                    break;
                }
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                if(dp[i][j]&&j-i+1>maxLen){
                    begin=i;
                    maxLen=j-i+1;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
