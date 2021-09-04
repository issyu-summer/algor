package back_trace;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/combination-sum/">39.组数综合</a><br/>
 * 回溯搜索所有可能、允许重复
 */
public class Main39 {
    int target;
    List<List<Integer>> res;
    List<Integer> path;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        if(candidates.length==0){
            return res;
        }
        path=new ArrayList<>();
        this.target=target;
        backTrace(candidates,0);
        return res;
    }

    private void backTrace(int[] ar, int deep) {
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = deep; i <ar.length; i++) {
            path.add(ar[i]);
            target-=ar[i];
            //允许重复
            //输入: candidates = [2,3,6,7], target = 7
            //输出: [[7],[2,2,3]]
            backTrace(ar,i);
            target+=ar[i];
            path.remove(path.size()-1);
        }
    }
}
