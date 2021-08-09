package hot;

import java.util.LinkedList;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        char[] ar1 = num1.toCharArray();
        char[] ar2 = num2.toCharArray();
        int i= ar1.length-1,j=ar2.length-1;
        int carry=0;
        int sum;
        while (i>=0||j>=0){
            int n1=i>=0?ar1[i]-'0':0;
            int n2=j>=0?ar1[i]-'0':0;
            sum=carry+n1+n2;
            if(sum>=10){
                carry=sum/10;
                sum-=10;
            }
            sb.append(sum);
            i--;
            j--;
        }
        sb.append(carry==1?carry:"");
        return sb.reverse().toString();
    }
}
