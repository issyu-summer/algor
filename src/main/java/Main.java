import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {


    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=0;
        for (int i = 1; i <=n; i++) {
            x=(x+3)%(i);
        }
        System.out.println(x);;
    }
}
