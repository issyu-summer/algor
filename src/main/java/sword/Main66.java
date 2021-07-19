package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main66 {

    /**
     * O（n^2）
     */
    public int[] constructArr(int[] a) {
        int []b=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int tmp=a[i];
            a[i]=1;b[i]=1;
            for (int j = 0; j < a.length; j++) {
                b[i]*=a[j];
            }
            a[i]=tmp;

        }
        return b;
    }

    public int[] constructArr1(int[] a) {
        int len=a.length;
        if(len==0){
            return new int[0];
        }
        int []b=new int[len];
        b[0]=1;
        for (int i = 1; i < len ; i++) {
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
