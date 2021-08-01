package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main152 {
    //内存超限
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int [][]dp=new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i]=nums[i];
        }
        int max=nums[0];

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                dp[i][j]=nums[j]*dp[i][j-1];
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }

    public int maxProduct1(int[] nums) {
        int len=nums.length;
        int []maxF=new int[len];
        int []minF=new int[len];
        maxF[0]=nums[0];
        minF[0]=nums[0];
        for (int i = 1; i < len; i++) {
            maxF[i]=Math.max(
                    Math.max(nums[i]*maxF[i-1],nums[i]),
                    nums[i]*minF[i-1]);
            minF[i]=Math.min(
                    Math.min(nums[i]*minF[i-1],nums[i]),
                    nums[i]*maxF[i-1]
            );
        }
        int res = maxF[0];
        for (int i = 1; i < len; ++i) {
            res = Math.max(res, maxF[i]);
        }
        return res;
    }

    public int maxProduct2(int[] nums) {
        int len=nums.length;
        int maxF=nums[0];
        int minF=nums[0];
        int res = maxF;
        for (int i = 1; i < len; i++) {
            int ma=maxF,mi=minF;
            maxF=Math.max(
                    Math.max(nums[i]*ma,nums[i]),
                    nums[i]*mi);
            minF=Math.min(
                    Math.min(nums[i]*mi,nums[i]),
                    nums[i]*ma
            );
            res = Math.max(res, maxF);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Main152().maxProduct2(new int[]{
                -4,-3,-2
        }));
    }
}
