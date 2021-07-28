package hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main46 {
    private List<List<Integer>> res;
    private List<Integer> tmp;
    private boolean[]visited;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        int len=nums.length;
        if(len==0){
            return res;
        }
        tmp=new ArrayList<>();
        visited=new boolean[len];
        backTrace(nums,0);
        return res;
    }

    private void backTrace(int []ar,int deep){
        if(deep==ar.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < ar.length; i++) {
            if(visited[i]){
                continue;
            }
            tmp.add(ar[i]);
            visited[i]=true;
            backTrace(ar,deep+1);
            tmp.remove(tmp.size()-1);
            visited[i]=false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main46().permute(new int[]{
                1,2,3
        }));
    }
}
