package back_trace;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/generate-parentheses/">括号生成</a><br/>
 * n对
 */
public class Main22 {

    StringBuilder sb;
    List<String> res;
    public List<String> generateParenthesis(int n) {
        sb=new StringBuilder();
        res=new ArrayList<>();
        backTrace(n,n);
        return res;
    }

    private void backTrace(int l, int r) {
        if(l==0&&r==0){
            res.add(sb.toString());
            return;
        }
        //左右括号不匹配
        if(l>r){
            return;
        }
        //左括号的数量还有剩余
        if(l>0){
            sb.append('(');
            backTrace(l-1,r);
            sb.deleteCharAt(sb.length()-1);
        }
        //右括号的数量还有剩余
        if(r>0){
            sb.append(')');
            backTrace(l,r-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
