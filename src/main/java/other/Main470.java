package other;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/implement-rand10-using-rand7/">使用rand7()实现rand10()</a><br/>
 * 拒绝采样 <br/>
 * (randx-1)*y+randy---->[1,x*y]
 */
public class Main470 {

    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        while(num > 40) {
            num = (rand7() - 1) * 7 + rand7();
        }
        // [1, 40] -> [0, 39] -> [0, 9] + [10, 19] + [20, 29] + [30, 39];
        return (num) % 10 + 1;
    }

    private int rand7(){
        return 1;
    }
}
