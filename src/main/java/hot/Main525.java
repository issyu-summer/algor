package hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main525 {
    public int findMaxLength(int[] nums) {
        int len=nums.length;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        int counter=0;
        map.put(0,-1);
        for (int i = 0; i < len; i++) {
            int n=nums[i];
            if(n==1){
                counter++;
            }else {
                counter--;
            }
            if(map.containsKey(counter)){
                Integer index = map.get(counter);
                res=Math.max(res,i-index);
            }else {
                map.put(counter,i);
            }
        }
        return res;
    }
}
