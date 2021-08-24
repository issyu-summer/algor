package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main31 {

    //下一个排列
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while (j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

    private void reverse(int[] ar, int start) {
        int l=start,r=ar.length-1;
        while (l<r){
            swap(ar,l,r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}

