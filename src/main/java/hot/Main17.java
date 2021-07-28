package hot;

import java.util.*;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main17 {
    static final Map<Character, String> map = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );
    private StringBuilder stringBuilder;
    private List<String> res;
    public List<String> letterCombinations(String digits) {
        char[] ar = digits.toCharArray();
        res=new ArrayList<>();
        if(ar.length==0){
            return res;
        }
        stringBuilder=new StringBuilder();
        backTrace(ar,0,0);
        return res;
    }

    private void backTrace(char []ar,int depth,int i){
        if(depth==ar.length){
            res.add(stringBuilder.toString());
            return;
        }
        String strings = map.get(ar[i]);
        for (char c : strings.toCharArray()) {
            stringBuilder.append(c);
            backTrace(ar, depth + 1,i+1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main17().letterCombinations("234"));
    }
}
