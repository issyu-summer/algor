package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main415 {

    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int carry=0,sum;
        char []a1,a2;
        int l1=(a1=num1.toCharArray()).length;
        int l2=(a2=num2.toCharArray()).length;
        while (l1>=0||l2>=0){
            int n1=l1>=0?a1[l1--]-'0':0;
            int n2=l2>=0?a2[l2--]-'0':0;
            sb.append((sum=n1+n2+carry)%10);
            carry=sum/10;
        }
        sb.append(carry==0?"":carry);
        return sb.reverse().toString();
    }
}
