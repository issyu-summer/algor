package shopee;

import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main215 {
    Random random=new Random();
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums,nums.length-k,0,nums.length-1);
    }
    private int quickSort(int[]arr,int k,int l,int r){
        int t=random.nextInt(r-l+1)+l;
        swap(arr,t,l);
        int i=l,j=r;
        while (i<j){
            while (i<j&&arr[j]>=arr[l]) j--;
            while (i<j&&arr[i]<=arr[l]) i++;
            swap(arr,i,j);
        }
        swap(arr,i,l);
        if(i>k) return quickSort(arr,k,l,i-1);
        if(i<k) return quickSort(arr,k,i+1,r);
        return arr[k];
    }
    private void swap(int[]arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
