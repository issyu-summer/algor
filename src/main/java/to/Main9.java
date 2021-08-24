package to;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main9 {

    //使用两个栈实现队列
    class CQueue {
        Stack<Integer> s;
        Stack<Integer> ds;
        public CQueue() {
            s=new Stack<>();
            ds=new Stack<>();
        }

        public void appendTail(int value) {
            s.push(value);
        }

        public int deleteHead() {
            if(!ds.isEmpty()){
                return ds.pop();
            }
            if(s.isEmpty()){
                return -1;
            }
            while (!s.isEmpty()){
                ds.push(s.pop());
            }
            return ds.pop();
        }
    }

}
