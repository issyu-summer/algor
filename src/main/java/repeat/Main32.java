package repeat;

import java.util.Stack;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/longest-valid-parentheses/">最长的有效括号</a><br/>
 * 栈存放索引
 */
public class Main32 {

    public int longestValidParentheses(String s) {
        int res=0;
        Stack<Integer> stack=new Stack<>(){{
            push(-1);
        }};
        //(() : stack[-1]\res=0 -> stack[-1,0,1]\res=0 -> stack[-1,0] res=max(0,2-0)=2
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    res=Math.max(res,i-stack.peek());
                }
            }
        }
        return res;
    }
}
