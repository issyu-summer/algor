package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int len=strs[0].length();
        for (int i=0;i<len;i++){
            char comp=strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i>=strs[j].length()||comp!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return "";
    }
}
