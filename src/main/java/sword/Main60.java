package sword;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main60 {

    public double[] dicesProbability(int n) {
       double [] dp=new double[6];
       Arrays.fill(dp,1.0/6.0);
        for (int i = 2; i < n; i++) {
            double[]tmp=new double[5*i+1];
            //原来5*(i-1)+1个骰子的贡献
            for (int j = 0; j < dp.length; j++) {
                //新增加的1个骰子的贡献
                for (int k = 0; k < 6; k++) {
                    tmp[j+k]+=dp[j]/6.0;
                }
            }
            dp=tmp;
        }
        return dp;
    }
}
