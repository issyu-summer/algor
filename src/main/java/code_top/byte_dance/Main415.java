package code_top.byte_dance;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main415 {

    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        char[] ar1 = num1.toCharArray();
        char[] ar2 = num2.toCharArray();
        int l1=ar1.length,l2=ar2.length;
        int carry=0;
        while (l1>=0||l2>=0){
            int a1=l1>=0?ar1[l1--]-'0':0;
            int a2=l2>=0?ar2[l2--]-'0':0;
            int sum=carry+a1+a2;
            sb.append(sum%10);
            carry=sum/10;
        }
        sb.append(carry==0?"":carry);
        return sb.reverse().toString();
    }
}
