package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {


    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Main3().findRepeatNumber(ints));
    }

    /**
     * 特点：n个数，从0~n-1
     */
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //是否占据别人的位置
            if (i == nums[i]) {
                i++;
                continue;
            }
            //是否占据自己的位置
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            //归位：将nums[i]放到位置nums[i]，位置i不一定正确，但位置nums[i]一定正确
            swap(nums,i,nums[i]);
        }
        return -1;
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }
}
