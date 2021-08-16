package to;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main45 {

    //把数组排成最小的数
    public String minNumber(int[] nums) {
        int len;
        String []ar=new String[(len=nums.length)];
        for (int i = 0; i <len; i++) {
            ar[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ar,(v1,v2)->(v1+v2).compareTo(v2+v1));
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(ar[i]);
        }
        return sb.toString();
    }
}
