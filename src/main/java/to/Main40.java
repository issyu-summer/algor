package to;

import java.util.Arrays;
import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main40 {

    //最小的K个数
    int k;
    Random random=new Random();
    public int[] getLeastNumbers(int[] arr, int k) {
        this.k=k;
        return quickSort(arr,0, arr.length-1);
    }

    private int[] quickSort(int []ar,int l,int r){
        if(l>=r){
            return Arrays.copyOf(ar,k);
        }
        int t=random.nextInt((r-l+1))+l;
        swap(ar,l,t);
        int i=l,j=r;
        while (i<j){
            while (i<j&&ar[j]>=ar[l]){
                j--;
            }
            while (i<j&&ar[i]<=ar[l]){
                i++;
            }
            swap(ar,i,j);
        }
        swap(ar,i,l);
        if(k>i){
            return quickSort(ar,i+1,r);
        }
        if(k<i){
            return quickSort(ar,l,i-1);
        }
        return Arrays.copyOf(ar,k);
    }

    private void swap(int[]ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

}
