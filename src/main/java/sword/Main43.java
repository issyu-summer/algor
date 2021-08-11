package sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main43 {

    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }

    class Solution {
        List<List<Integer>> res;
        List<Integer> tmp;
        public List<List<Integer>> permute(int[] nums) {
            res=new ArrayList<>();
            backTrace(nums,0);
            return res;
        }

        private void backTrace(int []ar,int depth){
            if(ar.length==depth){
                res.add(Arrays.stream(ar).boxed().collect(Collectors.toList()));
                return;
            }
            for(int i=depth;i<ar.length;i++){
                swap(ar,i,depth);
                backTrace(ar,depth+1);
                swap(ar,i,depth);
            }
        }
        private void swap(int []ar,int i,int j){
            int tmp=ar[i];
            ar[i]=ar[j];
            ar[j]=tmp;
        }
    }
}
