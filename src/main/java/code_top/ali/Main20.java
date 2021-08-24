package code_top.ali;

import java.util.Map;
import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main20 {

    //有效的括号
    Map<Character,Character> map= Map.of('(',')','[',']','{','}');
    public boolean isValid(String s) {
        if((s.length()&1)==1){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()) {
            if(map.containsKey(c)){
                stack.push(c);
            }
            if(map.containsValue(c)){
                if(stack.isEmpty()){
                    return false;
                }
                if(c!=map.get(stack.peek())){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
