package hot;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main8 {

    public int myAtoi(String s) {
        char[] ar = s.trim().toCharArray();
        int res=0,sign=1,i=1;
        int boundary=Integer.MAX_VALUE/10;
        if(ar[0]=='-'){
            sign=-1;
        }else if(ar[0]!='+'){
            i=0;
        }
        for (int j = i; j <ar.length ; j++) {
            if(ar[j]<'0'||ar[j]>'9'){
                break;
            }
            if(res>boundary||(res==boundary&&ar[j]>'7')){
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=10*res+(ar[j]-'0');
        }
        return res*sign;
    }

    public static void main(String[] args) {
        System.out.println(new Main8().myAtoi("2147483648"));
    }


}
