package shopee;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int a=-1,b=-1;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                if(a==-1){
                    a=i;
                }
                if(a!=i&&b==-1){
                    b=i;
                }
                count++;
            }
        }
        return s1.equals(s2)||s1.length() == s2.length() && count == 2&&s1.charAt(a)==s2.charAt(b)&&s2.charAt(a)==s1.charAt(b);
    }

    public static void main(String[] args) {
        System.out.println(new Main1790().areAlmostEqual("bank","kanb"));
    }
}
