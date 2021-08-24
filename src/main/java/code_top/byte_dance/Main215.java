package code_top.byte_dance;

import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main215 {
    Random random=new Random();
    private int k;
    public int findKthLargest(int[] nums, int k) {
        //第k大,len-k
        this.k= nums.length-k;
        return quickSort(nums,0,nums.length-1);
    }

    private int quickSort(int []ar,int l,int r){
        if(l>=r){
            return ar[k];
        }
        int tmp=random.nextInt((r-l+1))+l;
        swap(ar,tmp,l);
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
        if(i>k){
            quickSort(ar,l,i-1);
        }
        if(i<k){
            quickSort(ar,i+1,r);
        }
        return ar[k];
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }
}
