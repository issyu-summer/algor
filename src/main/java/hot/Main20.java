package hot;

import java.util.Map;
import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main20 {
    private static final Map<Character,Character> map= Map.of(
            '(',')','[',']','{','}'
    );
    public boolean isValid(String s) {
        char[] ar = s.toCharArray();
        if(ar.length==0){
            return true;
        }
        if(!map.containsKey(ar[0])){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for (char c:ar) {
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
