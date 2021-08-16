package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main58sb1 {

    public String reverseWords(String s) {
        int len;
        if((len=(s=s.trim()).length())==0){
            return "";
        }
        s = s.trim();
        int l=len-1,r=len-1;
        StringBuilder sb=new StringBuilder();
        while (l>=0){
            while (l>=0&& s.charAt(l) !=' '){
                l--;
            }
            sb.append(s,l+1,r+1).append(" ");
            while (l>=0&& s.charAt(l) ==' '){
                l--;
            }
            r=l;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new Main58sb1().reverseWords("the sky is blue"));
    }
}
