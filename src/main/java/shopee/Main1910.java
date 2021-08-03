package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1910 {
    public String removeOccurrences(String s, String part) {
        int len=part.length();
        while (s.contains(part)){
            int i = s.indexOf(part);
            System.out.println(i);
            s=s.substring(0,i)+s.substring(i+len);
        }
        return s;
    }
}
