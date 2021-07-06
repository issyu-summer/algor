package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main3 {


    /**
     * 特点：n个数，从0~n-1
     */
    public int findRepeatNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(i==nums[i]){
                i++;
                continue;
            }
            if (nums[i]==nums[nums[i]]){
                return nums[i];
            }
            int tmp=nums[nums[i]];
            nums[nums[i]]=nums[i];
            nums[i]=tmp;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Main3().findRepeatNumber(ints));
    }
}
