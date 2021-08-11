package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main647 {

    public int countSubstrings(String s) {
        int len=s.length();
        int res=0;
        for (int i = 0; i < 2 * len - 1; i++) {
            int l=i/2,r=l+i%2;
            while (l>=0&&r<=len-1){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                l--;
                r++;
                res++;
            }
        }
        return res;
    }
}
