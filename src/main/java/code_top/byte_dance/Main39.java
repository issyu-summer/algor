package code_top.byte_dance;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main39 {

    //组合总和2
    List<List<Integer>> res;
    List<Integer> path;
    int target;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        this.target=target;
        path = new ArrayList<>();
        dfs(candidates, 0);
        return res;
    }

    /**
     * @param candidates 候选数组
     * @param begin      搜索起点
     */
    private void dfs(int[] candidates, int begin) {
        // target 为负数和 0 的时候不再产生新的孩子结点
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 重点理解这里从 begin 开始搜索的语意
        for (int i = begin; i < candidates.length; i++) {
            path.add(candidates[i]);
            target-= candidates[i];
            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
            dfs(candidates, i);
            // 状态重置
            target+= candidates[i];
            path.remove(path.size()-1);
        }
    }
}
