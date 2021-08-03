/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main678 {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for (char c:s.toCharArray()){
            if(c=='('){
                min++;
                max++;
            }else if(c==')'){
                if(min>0){
                    min--;
                }
                if(max--==0){
                    return false;
                }
            }else {
                if(min>0){
                    min--;
                }
                max++;
            }
        }
        return min==0;
    }

}
