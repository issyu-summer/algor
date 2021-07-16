package sword;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main45 {

    public String minNumber(int[] nums) {
        String []ar=new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ar[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ar,(x,y)->(x+y).compareTo(y+x));
        StringBuilder s=new StringBuilder();
        for (String value : ar) {
            s.append(value);
        }
        return s.toString();
    }
}
