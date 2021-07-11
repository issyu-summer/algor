package sword;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main9 {
    class CQueue {

        private Stack<Integer> appendStack;
        //逆序栈
        private Stack<Integer> deleteStack;

        public CQueue() {
            appendStack = new Stack<>();
            deleteStack = new Stack<>();
        }

        public void appendTail(int value) {
            appendStack.push(value);
        }

        public int deleteHead() {
            if (!deleteStack.isEmpty()) {
                return deleteStack.pop();
            }
            if (appendStack.isEmpty()) {
                return -1;
            }
            while (!appendStack.isEmpty()) {
                deleteStack.push(appendStack.pop());
            }
            return deleteStack.pop();
        }
    }

}
