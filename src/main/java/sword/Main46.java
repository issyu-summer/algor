package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main46 {

    public int translateNum(int num) {
        String s=String.valueOf(num);
        int []dp=new int[s.length()];
        dp[0]=dp[1]=1;
        for (int i = 2; i < s.length(); i++) {
            int tmp=Integer.parseInt(s.substring(i-2,i));
            if(10<=tmp&&tmp<=25){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[s.length()-1];
    }
}
