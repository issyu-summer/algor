package code_top.byte_dance;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main32 {

    //最长有效括号
    public int longestValidParentheses(String s) {
        int res=0;
        //放入-1，便于计算
        Stack<Integer> stack=new Stack<>(){{
            push(-1);
        }};
        for (int i = 0; i < s.length(); i++) {
            //如果是（,将索引入栈
            if(s.charAt(i) =='('){
                stack.push(i);
            }else {
                //如果是），将左括号的索引出栈
                stack.pop();
                //如果栈为空，则放入）索引
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    //如果栈不为空，则计算长度
                    res=Math.max(res,i- stack.peek());
                }
            }
        }
        return res;
    }
}
