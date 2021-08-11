package hot;

import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4sb0 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        PriorityQueue<Integer> b=new PriorityQueue<>((v1,v2)->v2-v1);
        for (int j : nums1) {
            add(j, a, b);
        }
        for (int j : nums2) {
            add(j, a, b);
        }
        return a.size()==b.size()?(a.peek()+b.peek())/2.0:a.peek();
    }

    private void add(int n,PriorityQueue<Integer> a,PriorityQueue<Integer> b){
        if(a.size()==b.size()){
            b.offer(n);
            a.offer(b.poll());
        }else{
            a.offer(n);
            b.offer(a.poll());
        }
    }

    public static void main(String[] args) {
        System.out.println( new Main4sb0().findMedianSortedArrays(new int[]{
                1,2,3
        },new int[]{
                4,5,6
        }));
    }
}
