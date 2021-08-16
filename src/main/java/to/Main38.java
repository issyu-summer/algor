package to;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main38 {

    //字符串的全排列,含重复字符
    List<String> list;
    public String[] permutation(String s) {
        list=new ArrayList<>();
        backTrace(s.toCharArray(),0);
        return list.toArray(new String[0]);
    }

    private void backTrace(char []ar,int deep){
        int len;
        if(deep==(len=ar.length)-1){
            list.add(String.valueOf(ar));
            return;
        }
        Set<Character> set=new HashSet<>();
        char c;
        for (int i = deep; i <len; i++) {
            if(set.contains((c=ar[i]))){
                continue;
            }
            set.add(c);
            swap(ar,i,deep);
            backTrace(ar,deep+1);
            swap(ar,i,deep);
        }
    }

    private void swap(char []ar,int i,int j){
        char t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }
}
