package hot;

import java.util.Stack;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main394 {

    /**
     * 解码字符串
     */
    public String decodeString(String s) {
        int multi=0;
        StringBuilder res=new StringBuilder();
        Stack<Integer> stackI=new Stack<>();
        Stack<String> stackS=new Stack<>();
        for (char c:s.toCharArray()) {
            //连续的数字
            if(c>='0'&&c<='9'){
                multi=multi*10+(c-'0');
            }else if(c=='['){
                stackI.push(multi);
                stackS.push(res.toString());
                multi=0;
                res=new StringBuilder();
            }else if(c==']'){
                StringBuilder tmp=new StringBuilder();
                int cur=stackI.pop();
                for (int i = 0; i < cur; i++) {
                    tmp.append(res);
                }
                res=new StringBuilder(stackS.pop()+tmp);
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
