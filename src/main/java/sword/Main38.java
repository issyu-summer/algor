package sword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main38 {

    List<String> list;
    private StringBuilder sb;
    private boolean []visited;
    public String[] permutation(String s) {
        list=new ArrayList<>();
        char[] chars = s.toCharArray();
        visited=new boolean[s.length()];
        sb=new StringBuilder();
        dfs(chars,0);
        int size = list.size();
        String[] recArr = new String[size];
        for (int i = 0; i < size; i++) {
            recArr[i] = list.get(i);
        }
        return recArr;
    }

    private void backTrace(char []chars,int deep){
        if(deep==chars.length){
            list.add(sb.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if(visited[i]||(i>0&&!visited[i-1]&&chars[i]==chars[i-1])){
                continue;
            }
            sb.append(chars[i]);
            visited[i]=true;
            backTrace(chars,deep+1);
            sb.deleteCharAt(sb.length()-1);
            visited[i]=false;
        }
    }

    private void dfs(char[]ar,int deep){
        if(deep==ar.length){
            list.add(String.valueOf(ar));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for (int i = deep; i < ar.length; i++) {
            if(set.contains(ar[i])){
                continue;
            }
            set.add(ar[i]);
            swap(ar,i,deep);
            dfs(ar,deep+1);
            swap(ar,i,deep);
        }
    }
    private void swap(char []ar,int i,int j){
        char tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main38().permutation("rabbbit")));
    }
}
