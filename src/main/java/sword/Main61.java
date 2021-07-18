package sword;

import java.util.HashSet;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main61 {

    public boolean isStraight(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0,min=14;
        for (int num:nums) {
            if(num==0){
                continue;
            }
            if(!set.add(num)){
                return false;
            }
            max= Math.max(max,num);
            min=Math.min(min,num);
        }
        return max-min<5;
    }
}
