package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main34 {

    public int[] searchRange(int[] nums, int target) {
        int left=leftIndex(nums,target);
        int right=rightIndex(nums,target);
        if(left==-2||right==-2){
            return new int[]{
                    -1,-1
            };
        }
        if(right-left>1){
            return new int[]{
                    left+1,right-1
            };
        }
        return new int[]{
                -1,-1
        };
    }

    private int leftIndex(int []nums,int target){
        int len=nums.length;
        int i=0,j=len-1,left=-2;
        while (i<=j){
            int mid=i+((j-i)>>1);
            if(target<=nums[mid]){
                j=mid-1;
                left=j;
            }else {
                i=mid+1;
            }
        }
        return left;
    }

    private int rightIndex(int []nums,int target){
        int len=nums.length;
        int i=0,j=len-1,right=-2;
        while (i<=j){
            int mid=i+((j-i)>>1);
            if(target>=nums[mid]){
                i=mid+1;
                right=i;
            }else {
                j=mid-1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main34().searchRange(new int[]{
                5, 7, 7, 8, 8, 10
        }, 6)));
    }
}
