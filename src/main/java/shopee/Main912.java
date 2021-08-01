package shopee;

import java.util.Arrays;
import java.util.Random;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main912 {

    private Random random=new Random();
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int []ar,int l,int r){
        if(l>=r){
            return;
        }
        int t=random.nextInt(r-l+1)+l;
        swap(ar,t,l);
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
        //i已经归位不要再找i的麻烦了
        quickSort(ar,l,i-1);
        quickSort(ar,i+1,r);
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main912().sortArray(new int[]{
                9, 2, 3, 4, 56, 46, 64, 64, 654, 465
        })));
    }


}
