package hot;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main75 {

    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1;
        while (i<j){
           while (i<j&&nums[i]==0){
               i++;
           }
           while (i<j&&nums[j]!=0){
               j--;
           }
           swap(nums,i,j);
        }
        i=0;
        while (i < nums.length){
            if (nums[i]!=0) break;
            i++;
        }
        j=nums.length-1;
        while (i<j){
            while (i<j&&nums[j]!=1){
                j--;
            }
            while (i<j&&nums[i]!=2){
                i++;
            }
           swap(nums,i,j);
        }
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        int[] ar = {
                0, 2, 0, 2, 1, 1, 0
        };
        new Main75().sortColors(ar);
        System.out.println(Arrays.toString(ar));
    }
}
