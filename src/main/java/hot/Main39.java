package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main39 {

    List<List<Integer>> res;
    List<Integer> tmp;
    private int target;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        if(candidates.length==0){
            return res;
        }
        Arrays.sort(candidates);
        tmp=new ArrayList<>();
        this.target=target;
        backTrace(candidates,0,0);
        return res;
    }

    public void backTrace(int []ar,int deep,int sum){
        if(sum==target){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = deep; i < ar.length; i++) {
            int j = ar[i];
            sum += j;
            //不排序只能把减枝放在外面
            if(sum>target){
                return;
            }
            tmp.add(j);
            backTrace(ar, i, sum);
            tmp.remove(tmp.size() - 1);
            sum -= j;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main39().combinationSum(new int[]{
                2,6,7,3
        },7));
    }
}
