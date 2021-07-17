package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main58sb1 {

    public String reverseWords(String s) {
        s=s.trim();
        int j=s.length()-1,i=j;
        StringBuilder sBuilder=new StringBuilder();
        while (i>=0){
            while (i>=0&&s.charAt(i)!=' '){
                i--;
            }
            sBuilder.append(s,i+1,j+1).append(" ");
            while (i>=0&&s.charAt(i)==' '){
                i--;
            }
            j=i;
        }
        return sBuilder.toString().trim();
    }
}
