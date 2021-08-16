package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main62 {

    //圆圈中剩下的数字，约瑟夫环问题
    public int lastRemaining(int n, int m) {
        int remain=0;
        for (int i = 1; i < n; i++) {
            remain=(remain+m)%i;
        }
        return remain;
    }
}
