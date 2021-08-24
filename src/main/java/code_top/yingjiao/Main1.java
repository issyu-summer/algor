package code_top.yingjiao;

import code_top.byte_dance.Main129;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main1 {

    public int mulDigits (String num) {
        // write code here
        char[] ar = num.toCharArray();
        while (ar.length!=1) {
            int tmp=1;
            for (int i = 0; i < ar.length; i++) {
                ar[i] += 1;
                if(ar[i]=='1'){
                    continue;
                }
                tmp=nineMulti(tmp,ar[i]-'0');
            }
            ar=String.valueOf(tmp).toCharArray();
            if(ar.length>3){
                return -1;
            }
        }
        return ar[0]-'0';
    }

    private int nineMulti(int a,int b){
       int tmp=a*b;
       return tmp/9*10+tmp%9;
    }

    public static void main(String[] args) {
        System.out.println(new Main1().mulDigits("80"));
    }
}
