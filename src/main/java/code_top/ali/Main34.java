package code_top.ali;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main34 {
    public int[] searchRange(int[] nums, int target) {
        int l=helper(nums,target-1);
        int r=helper(nums,target);
        if(l==nums.length||nums[l]!=target)
            return new int[]{-1,-1};
        return new int[]{
                l,r-1
        };
    }

    //大于的第一个
    private int helper(int []ar,int target){
        int l=0,r=ar.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(ar[m]<=target){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main34().searchRange(new int[]{
                5, 7, 7, 8, 8, 10
        }, 8)));
    }

    //大于等于的第一个
    public  int  helper1(int []ar,int target){
        int l=0,r=ar.length;
        while(l<r){
            int mid=(r+l)>>1;
            if(ar[mid]>=target)
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
}
