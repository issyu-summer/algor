package array;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Array {

    /**
     * 矩阵相乘
     */
    public static int[][] matrixMulti(
            int [][]a,int [][]b){
        int n=a.length;
        int [][]c=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j]+=a[i][k]+b[k][j];
                }
            }
        }
        return c;
    }

    /**
     * 素数
     */
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        //善用乘法
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * 计算平方根（牛顿迭代）
     */
    public static double sqrt(double c){
        if(c<0){
            return Double.NaN;
        }
        double err=1e-15;
        double t=c;
        while (Math.abs(t-c/t)>err*t){
            t=(c/t+t)/2.0;
        }
        return t;
    }

    public static double h(int n){
        double sum=0.0;
        for (int i = 0; i < n; i++) {
            sum+=1.0/i;
        }
        return sum;

    }
}
