package sword;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main67 {

    public int strToInt(String str) {
        //去除首尾空格
        char[] c = str.trim().toCharArray();
        if (c.length == 0) return 0;
        int res = 0, boundary = Integer.MAX_VALUE / 10;
        int i = 1, sign = 1;
        //是符号,符号位置为-1
        if (c[0] == '-') sign = -1;
        //不是正好,则从0开始循环,是,则从1开始
        else if (c[0] != '+') i = 0;
        for (int j = i; j < c.length; j++) {
            //不是数字,直接退出
            if (c[j] < '0' || c[j] > '9') break;
            //越界,最大或最小
            if (res > boundary || res == boundary && c[j] > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (c[j] - '0');
        }
        return sign * res;
    }
}
