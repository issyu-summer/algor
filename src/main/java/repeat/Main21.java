package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/">sw21.奇数位于偶数前</a><br/>
 */
public class Main21 {
    public int[] exchange(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<r){
            while (l<r&&(nums[l]&1)==1){
                l++;
            }
            while (l<r&&(nums[r]&1)==0){
                r--;
            }
            swap(nums,l,r);
        }
        return nums;
    }

    private void swap(int[] ar, int l, int r) {
        int t=ar[l];
        ar[l]=ar[r];
        ar[r]=t;
    }
}
