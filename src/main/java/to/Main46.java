package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main46 {

    //把数字翻译程字符串
    public int translateNum(int num) {
        int len, tmp;
        String s=String.valueOf(num);
        int []dp=new int[(len=s.length())+1];
        dp[0]=dp[1]=1;
        for (int i = 2; i <len+1; i++) {
            tmp=Integer.parseInt(s.substring(i-2,i));
            if(tmp>=10&&tmp<=25){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[len];
    }
}
