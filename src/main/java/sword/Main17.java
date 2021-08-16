package sword;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main17 {

    private int n;
    private StringBuilder sBuilder;
    private final char[]loop={'0','1','2','3','4','5','6','7','8','9'};
    private int start;
    private int nine;
    private int []ar;
    private int count;
    public int[] printNumbers(int n) {
        sBuilder=new StringBuilder();
        this.n=n;
        this.count=0;
        this.nine=0;
        this.start=n-1;
        this.ar=new int[(int) (Math.pow(10,n)-1)];
        backTrace(0);
        return ar;
    }

    private void backTrace(int i){
        if(i==n){
            String s=sBuilder.substring(start);
            if(!s.equals("0")){
                this.ar[count++]=Integer.parseInt(s);
            }
            if(n-start==nine){
                start--;
            }
            return;
        }

        for (char c:loop) {
            if(c=='9'){
                nine++;
            }
            sBuilder.append(c);
            backTrace(i+1);
            sBuilder.deleteCharAt(sBuilder.length() - 1);
        }
        //对整个for都有效
        nine--;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main17().printNumbers(3)));
    }


}
