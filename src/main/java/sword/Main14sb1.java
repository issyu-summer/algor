package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main14sb1 {

    //剪绳子
    public int cuttingRope(int n) {
        //此处根据题意必须分
        if (n <= 3) {
            return n - 1;
        }
        //长度3的绳子分成多段和不分是不一样的
        int[] dp = new int[n + 2];
        //最长就是不分
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < n + 2; i++) {
            for (int j = 2; j < i - 1; j++) {
                dp[i] = Math.max(j * dp[i - j],dp[i]);
            }
        }
        return dp[n];
    }
}
