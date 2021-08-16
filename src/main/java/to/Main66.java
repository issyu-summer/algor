package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main66 {
    public int[] constructArr(int[] a) {
        int len;
        int []b=new int[(len=a.length)];
        b[0]=1;
        for (int i = 1; i < len; i++) {
            b[i]=b[i-1]*a[i-1];
        }
        int tmp=1;
        for (int i = len-2; i >=0; i--) {
            tmp*=a[i+1];
            b[i]*=tmp;
        }
        return b;
    }
}
