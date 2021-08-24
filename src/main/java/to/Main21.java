package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main21 {

    //奇数位于偶数前
    public int[] exchange(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<r){
            while (l<r&&(nums[r]&1)==0){
                r--;
            }
            while (l<r&&(nums[l]&1)!=0){
                l++;
            }
            swap(nums,l,r);
        }
        return nums;
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

}
