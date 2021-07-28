package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main338 {

     public int[] countBits(int n) {
        int []ar=new int[n+1];
        for (int i = 0; i < n + 1; i++) {
            ar[i]=hammingWeight(i);
        }
        return ar;
    }

    private int hammingWeight(int i){
        int res=0;
        while (i!=0){
            res++;
            i&=i-1;
        }
        return res;
    }

    public int[] countBits1(int n) {
         int []res=new int[n+1];
         res[0]=0;res[1]=1;
         int tmp=0;
         for (int i = 2; i < n+1 ; i++) {
            if((i&i-1)==0){
                tmp=i;
            }
            //偶数提供1位,剩下的奇数提供res[i-tmp]位
            res[i]=res[i-tmp]+1;
         }
         return res;
    }
}
