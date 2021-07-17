package sword;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main59sb1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0){
            return new int[0];
        }
        LinkedList<Integer> queue=new LinkedList<>();
        int []res=new int[nums.length-k+1];
        for (int i = 0,j=1-k; i < nums.length; i++,j++) {
            if(j>0&&queue.peekFirst()==nums[j-1]){
                queue.removeFirst();
            }
            while (!queue.isEmpty()&&queue.peekLast()<nums[i]){
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            if(j>=0){
                res[j]=queue.peekFirst();
            }
        }
        return res;
    }
}
