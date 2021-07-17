package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main58sb2 {

    public String reverseLeftWords(String s, int n) {
        if(s==null){
            return null;
        }
        //不包括n
        String s1 = s.substring(0, n);
        //从n开始到结尾
        String s2 = s.substring(n);
        return s2+s1;
    }
}
