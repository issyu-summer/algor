package hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main22 {

    private StringBuilder stringBuilder;
    private List<String> res;
    public List<String> generateParenthesis(int n) {
        stringBuilder=new StringBuilder();
        res=new ArrayList<>();
        backTrace(n,n);
        return res;
    }

    private void backTrace(int l,int r){
        if(l==0&&r==0){
            res.add(stringBuilder.toString());
            return;
        }
        //将右分支全部剪掉
        if(l>r){
            return;
        }
        if(l>0){
            stringBuilder.append('(');
            backTrace(l-1,r);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if(r>0){
            stringBuilder.append(')');
            backTrace(l,r-1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
