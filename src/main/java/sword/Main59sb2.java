package sword;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main59sb2 {

    class MaxQueue {
        private LinkedList<Integer> queue;
        private LinkedList<Integer> descQueue;
        public MaxQueue() {
            queue=new LinkedList<>();
            descQueue=new LinkedList<>();
        }

        public int max_value() {
            return descQueue.isEmpty()?-1:descQueue.peekFirst();
        }

        public void push_back(int value) {
            queue.addLast(value);
            while (!descQueue.isEmpty()&&descQueue.peekLast()<value){
                descQueue.removeLast();
            }
            descQueue.addLast(value);
        }

        public int pop_front() {
            if(queue.isEmpty()) {
                return -1;
            }
            if(queue.peekFirst().equals(descQueue.peekFirst())){
                descQueue.removeFirst();
            }
            return queue.removeFirst();
        }
    }
}
