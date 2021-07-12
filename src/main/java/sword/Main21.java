package sword;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main21 {

    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        while (i<j){
            //寻找偶数
            while (i<j&&(nums[i]&1)!=0){
                i++;
            }
            //寻找奇数
            while (i<j&&(nums[j]&1)==0){
                j--;
            }
            //找到一组后交换
            exchange(nums,i,j);
        }
        return nums;
    }

    private void exchange(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main21().exchange(new int[]{1, 2, 3, 4})));
    }
}
