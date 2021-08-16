package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main44 {

    //数字序列中的某一位数
    public int findNthDigit(int n) {
        int digit=1;
        long start=1,count=9;
        while (n>count){
            n-=count;
            digit+=1;
            start*=10;
            count=start*digit*9;
        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
