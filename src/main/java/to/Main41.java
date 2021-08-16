package to;

import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main41 {

    class MedianFinder {

        PriorityQueue<Integer> a;
        PriorityQueue<Integer> b;
        /** initialize your data structure here. */
        public MedianFinder() {
            a=new PriorityQueue<>();
            b=new PriorityQueue<>((v1,v2)->(v2-v1));
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
            int tmp=-1;
            return a.size()==b.size()?((tmp=a.peek())+b.peek())/2.0:tmp;
        }
    }
}
