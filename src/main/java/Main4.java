import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main4 {
    private boolean isAb(String s){
        char []ar;
        int len;int l;int i=0;
        while (i<(len=(ar=s.toCharArray()).length)){
            l=i;
            int ca=0,cb=0;
            while (l<len){
                if(ar[l]=='a'){
                    l++;
                    ca++;
                }else {
                    break;
                }
            }
            while (l<len){
                if(ar[l]=='b'){
                    l++;
                    cb++;
                }else {
                    break;
                }
            }
            if(l<len&&ar[l]=='b'){
                return false;
            }
            if(ca!=cb){
                return false;
            }
            i=l;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            if(new Main4().isAb(s.next())){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
