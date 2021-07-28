package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main9 {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int j = s.length() / 2;
        int i=s.length()%2==0?s.length()/2-1:s.length()/2;
        while (i>=0&&j<=s.length()-1){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        boolean [][]dp=new boolean[len][len];
        for (int l = 2; l <=len; l++) {
            for (int i = 0; i < len; i++) {
                int j=l+i-1;
                if (j>= len){
                    break;
                }
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]= true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
            }
        }
        return dp[0][s.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(new Main9().isPalindrome1(-121));
    }
}
