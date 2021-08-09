package sword;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int a=0;
        for (int j : pushed) {
            stack.push(j);
            while (!stack.isEmpty()&&stack.peek() == popped[a]) {
                stack.pop();
                a++;
            }
        }
        return stack.isEmpty();
    }
}
