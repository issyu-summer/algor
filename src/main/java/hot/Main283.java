package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main283 {

    public void moveZeroes(int[] nums) {
        int l=0,r=0,len=nums.length;
        while (r<len){
            if(nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
            r++;
        }
    }

    private void swap(int []ar,int l,int r){
        int tmp=ar[l];
        ar[l]=ar[r];
        ar[r]=tmp;
    }
}
