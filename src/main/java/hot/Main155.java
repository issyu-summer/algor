package hot;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main155 {
    class MinStack{
        Stack<Integer> stack;
        Stack<Integer> minStack;
        public MinStack() {
            stack=new Stack<>();
            minStack=new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(minStack.isEmpty()){
                minStack.push(val);
            }else {
                if(val<=minStack.peek()){
                    minStack.push(val);
                }
            }
        }

        public void pop() {
            if(stack.pop().equals(minStack.peek())){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
