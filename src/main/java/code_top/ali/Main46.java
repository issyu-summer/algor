package code_top.ali;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main46 {

    List<List<Integer>> res;
    int len;
    List<Integer> tmp;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        if((len=nums.length)==0){
            return res;
        }
        tmp=new LinkedList<>();
        backTrace(nums,0);
        return res;
    }

    private void backTrace(int[] ar, int deep) {
        if(deep==len-1){
            for (int n:ar) {
                tmp.add(n);
            }
            res.add(new LinkedList<>(tmp));
            tmp=new LinkedList<>();
        }
        for (int i = deep; i < len; i++) {
            swap(ar,deep,i);
            backTrace(ar,deep+1);
            swap(ar,deep,i);
        }
    }

    private void swap(int []ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }
}
