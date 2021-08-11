package sword;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main41 {

    //寻找小的中最大的,大的中最小的即可
    class MedianFinder{

       PriorityQueue<Integer> a;
       PriorityQueue<Integer> b;
        public MedianFinder() {
            a=new PriorityQueue<>();
            b=new PriorityQueue<>(Comparator.reverseOrder());
        }

        public void addNum(int num) {
           if(a.size()==b.size()){
               b.offer(num);
               a.offer(b.poll());
           }else {
               a.offer(num);
               b.offer(a.poll());
           }
        }

        public double findMedian() {
            return a.size()==b.size()?(a.peek()+b.peek())/2.0:a.peek();
        }
    }



}
