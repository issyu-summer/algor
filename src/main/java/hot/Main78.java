package hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main78 {

    private List<List<Integer>> res;
    private List<Integer> tmp;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        tmp=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            backTrace(nums,i,0);
        }
        return res;
    }

    private void backTrace(int []nums,int level,int start){
        if(level==0){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            tmp.add(nums[i]);
            backTrace(nums,level-1,i+1);
            tmp.remove(tmp.size()-1);
        }
    }


}
