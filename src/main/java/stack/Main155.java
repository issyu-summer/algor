package stack;

import java.util.Stack;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/min-stack/">最小栈</a><br/>
 * 普通栈+非严格递减栈
 */
public class Main155 {
    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> mStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack=new Stack<>();
            mStack=new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(mStack.isEmpty()){
                mStack.push(val);
            }else{
                if(val<=mStack.peek()){
                    mStack.push(val);
                }
            }
        }

        public void pop() {
            if(stack.pop().equals(mStack.peek())){
                mStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return mStack.peek();
        }
    }
}
