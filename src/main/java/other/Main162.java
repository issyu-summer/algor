package other;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/find-peak-element/">寻找峰值</a><br/>
 * 二分搜索\不含等号->下降态势、从左边找：ar[m]>ar[m+1] r=m ->反之从右边找
 */
public class Main162 {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<r){
            int m=l+((r-l)>>1);
            //呈现下降的态势,所以要从左边找
            if(nums[m]>nums[m+1]){
                r=m;
            }else {
                //呈现上升的态势，所以要从右边找
                l=m+1;
            }
        }
        return l;
    }
}
