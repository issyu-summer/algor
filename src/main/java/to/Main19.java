package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main19 {

    //正则表达式的匹配
    public boolean isMatch(String s, String p) {
        s=" "+s;
        p=" "+p;
        int sl,pl;
        boolean [][]dp=new boolean[(sl=s.length())][(pl=p.length())];
        dp[0][0]=true;
        for (int i = 2; i <pl ; i+=2) {
            dp[0][i]=dp[0][i-2]&& p.charAt(i) =='*';
        }
        for (int i = 1; i < sl; i++) {
            for (int j = 1; j < pl; j++) {
                if(p.charAt(j) =='*'){
                    dp[i][j]=dp[i][j-2]||(dp[i-1][j]&& match(s,p,i,j-1));
                }else {
                    dp[i][j]=dp[i-1][j-1]&&match(s,p,i,j);
                }
            }
        }
        return dp[sl-1][pl-1];
    }

    private boolean match(String s,String p,int i,int j){
        return s.charAt(i)==p.charAt(j)||p.charAt(j)=='.';
    }
}
