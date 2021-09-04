package back_trace;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/subsets/">子集</a><br/>
 * 无返回条件,自然结束
 */
public class Main78 {
    List<List<Integer>> res;
    List<Integer> subset;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        subset=new ArrayList<>();
        backTrace(nums,0);
        return res;
    }

    private void backTrace(int[] ar, int deep) {
        res.add(new ArrayList<>(subset));
        for (int i = deep; i < ar.length; i++) {
            subset.add(ar[i]);
            backTrace(ar,i+1);
            subset.remove(subset.size()-1);
        }
    }

}
