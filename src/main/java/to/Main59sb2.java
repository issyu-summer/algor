package to;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main59sb2 {

    //队列中的最大值
    class MaxQueue {

        LinkedList<Integer> q;
        LinkedList<Integer> descQ;
        public MaxQueue() {
            q=new LinkedList<>();
            descQ=new LinkedList<>();
        }

        public int max_value() {
            return descQ.isEmpty()?-1:descQ.peekFirst();
        }

        public void push_back(int value) {
            q.add(value);
            while (!descQ.isEmpty()&&descQ.peekLast()<=value){
                descQ.removeLast();
            }
            descQ.add(value);
        }

        public int pop_front() {
            if(q.isEmpty()) return -1;
            Integer res;
            if((res=q.removeFirst()).equals(descQ.peekFirst())){
                return descQ.removeFirst();
            }
            return res;
        }
    }
}
