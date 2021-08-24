import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Subsets {
    List<List<Integer>> res;
    List<Integer> tmp;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        tmp=new ArrayList<>();
        backTrace(nums,0);
        return res;
    }

    private void backTrace(int[] ar, int deep) {
        res.add(new LinkedList<>(tmp));
        for (int i = deep; i < ar.length; i++) {
            tmp.add(ar[i]);
            backTrace(ar,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
