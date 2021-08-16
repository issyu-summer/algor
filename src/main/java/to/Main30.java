package to;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main30 {

    //30、包含min函数的栈、ds小的时候入
    class MinStack {

        Stack<Integer> s;
        Stack<Integer> ds;
        /** initialize your data structure here. */
        public MinStack() {
            s=new Stack<>();
            ds=new Stack<>();
        }

        public void push(int x) {
            s.push(x);
            if(ds.isEmpty()){
                ds.push(x);
            }else {
                //小的时候入
                if(ds.peek()>=x){
                    ds.push(x);
                }
            }
        }

        public void pop() {
            if(s.pop().equals(ds.peek())){
                ds.pop();
            }
        }

        public int top() {
            return s.peek();
        }

        public int min() {
            return ds.peek();
        }
    }
}
