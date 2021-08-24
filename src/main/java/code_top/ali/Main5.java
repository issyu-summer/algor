package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main5 {

    public String longestPalindrome(String s) {
        int len;
        if((len=s.length())<=1){
            return s;
        }
        int begin=0,maxL=0;
        boolean [][] dp=new boolean[len][len];
        //枚举长度，小于等于len
        for (int l = 2; l <=len; l++) {
            //左边界可以从0~len-1
            for (int i = 0; i <len; i++) {
                //右边界:j-i+1=l
                int j=l+i-1;
                //越界，break
                if(j>=len){
                    break;
                }
                //不相等false
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {
                    //相等且长度小于3，true
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        //相等且长度大于等于3，看内部是否相等
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                //如果从i到j是回文串的话,更新begin和maxLength
                if(dp[i][j]&&maxL<j-i+1){
                    begin=i;
                    maxL=j-i+1;
                }
            }
        }
        //截取字符串（i,i-j+1+i）->(i,j+1)->左闭右开
        return s.substring(begin,begin+maxL);
    }
}
