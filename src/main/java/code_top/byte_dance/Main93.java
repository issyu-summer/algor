package code_top.byte_dance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main93 {


    //复原IP地址
    private List<String> res;
    private List<String> path;
    public List<String> restoreIpAddresses(String s) {
        int len;
        res = new ArrayList<>();
        // 如果长度不够，不搜索
        if ((len=s.length()) < 4 || len > 12) {
            return res;
        }
        path = new ArrayList<>(4);
        int splitTimes = 0;
        dfs(s, len, splitTimes, 0);
        return res;
    }

    /**
     * 判断 s 的子区间 [left, right] 是否能够成为一个 ip 段
     * 判断的同时顺便把类型转了
     */
    private int judgeIfIpSegment(String s, int left, int right) {
        int len = right - left + 1;
        // 大于 1 位的时候，不能以 0 开头
        if (len > 1 && s.charAt(left) == '0') {
            return -1;
        }
        // 转成 int 类型
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        if (res > 255) {
            return -1;
        }
        return res;
    }

    private boolean lengthNotRight(int remain,int split){
        //剩下的不够
        return remain < (4 - split) ||
                //剩下的太多了
                remain > 3 * (4 - split);
    }

    private void dfs(String s, int len, int split, int begin) {
        if (begin == len) {
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }
        if (lengthNotRight(len-begin,split)) {
            return;
        }
        //每次可以选取1~3位
        for (int i = 0; i < 3; i++) {
            //长度超过了限制
            if (begin + i >= len) {
                break;
            }
            //begin~begin+0/begin+1/begin+2
            int ipSegment = judgeIfIpSegment(s, begin, begin + i);
            //不是正确的数字
            if (ipSegment == -1) {
                continue;
            }
            // 在判断是 ip 段的情况下，才去做截取
            path.add(ipSegment + "");
            //begin从begin+i+1开始
            dfs(s, len, split + 1, begin + i + 1);
            path.remove(path.size()-1);
        }
    }
}
