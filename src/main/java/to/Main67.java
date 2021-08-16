package to;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main67 {

    public int strToInt(String str) {
        char[] ar = str.trim().toCharArray();
        int len;
        if((len=ar.length)==0){
            return 0;
        }
        int sign=1,res=0,i=1;
        int b=Integer.MAX_VALUE/10;
        if(ar[0]=='-'){
            sign=-1;
        }else if(ar[0]!='+'){
            i=0;
        }
        char c;
        for(;i<len;i++){
            if(noNumber((c=ar[i]))){
                break;
            }
            if(res>b||(res==b&&c>'7')){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+(c-'0');
        }
        return res*sign;
    }

    private boolean noNumber(char c){
        return !Character.isDigit(c);
    }
}
