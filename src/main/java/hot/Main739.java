package hot;

import java.util.Deque;
import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int []ar=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++){
            while (!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]) {
                Integer index = stack.pop();
                ar[index] = i - index;
            }
            stack.push(i);
        }
        return ar;
    }
}
