package to;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main31 {

    //31、栈的压入、弹出序列
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int t=0;
        for (int j : pushed) {
            stack.push(j);
            while (!stack.isEmpty() && stack.peek() == popped[t++]) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
