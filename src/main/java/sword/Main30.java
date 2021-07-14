package sword;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main30 {

    class MinStack{
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        public MinStack() {
            stack=new Stack<>();
            minStack=new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if(minStack.isEmpty()){
                minStack.push(x);
            }else {
                if(x<=minStack.peek()){
                    minStack.push(x);
                }
            }
        }

        public void pop() {
            boolean equals = stack.pop().equals(minStack.peek());
            if(equals){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }
}
