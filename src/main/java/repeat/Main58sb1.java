package repeat;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/">sw58.1.反转单词序列</a><br/>
 */
public class Main58sb1 {
    public String reverseWords(String s) {
        int len;
        if((len=(s=s.trim()).length())==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int l=len-1,r=len-1;
        while (l>=0){
            while (l>=0&& s.charAt(l) !=' '){
                l--;
            }
            //l指向空格
            sb.append(s,l+1,r+1).append(" ");
            while (l>=0&&s.charAt(l)==' '){
                l--;
            }
            r=l;
        }
        return sb.toString().trim();
    }
}
