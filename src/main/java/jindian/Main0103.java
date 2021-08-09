package jindian;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main0103 {
    public String replaceSpaces(String S, int length) {
        char[] ar = S.trim().toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(ar[i]!=' '){
                sb.append(ar[i]);
            }else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
