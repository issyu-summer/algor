import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Sort {

    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    Random random=new Random();
    private void quickSort(int[] ar, int l, int r) {
        if(l>=r){
            return;
        }
        int tmp=random.nextInt((r-l+1))+l;
        swap(ar,l,tmp);
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
        quickSort(ar,l,i-1);
        quickSort(ar,i+1,r);
    }

    private void swap(int[] ar, int i, int j) {
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;

    }

}
