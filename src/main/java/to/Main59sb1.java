package to;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main59sb1 {

    //滑动窗口中的最大值
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len;
        if((len=nums.length)==0||k==0){
            return new int[0];
        }
        int []res=new int[len-k+1];
        LinkedList<Integer> list=new LinkedList<>();
        for (int r = 0,l=1-k; r < len; r++,l++) {
            if(l>0&&list.peekFirst()==nums[l-1]){
                list.removeFirst();
            }
            while (!list.isEmpty()&&list.peekLast()<nums[r]){
                list.removeLast();
            }
            list.addLast(nums[r]);
            if(l>=0){
                res[l]=list.peekFirst();
            }
        }
        return res;
    }
}
