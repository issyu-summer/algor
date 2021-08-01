package hot;

import java.util.HashSet;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for (int n:nums) {
            set.add(n);
        }
        int longest=0;
        for (int n:set) {
            if(!set.contains(n-1)){
                int current=n;
                int tmp=1;
                while (set.contains(current+1)){
                    current+=1;
                    tmp+=1;
                }
                longest=Math.max(tmp,longest);
            }
        }
        return longest;
    }
}
