package ten;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {

    public boolean search(int []ar,int target){
        int l=0,r=ar.length-1;
        while (l<=r){
            int m=l+((r-l)>>1);
            if(target<ar[m]){
                r=m-1;
            }else if(target>ar[m]){
                l=m+1;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean search = new Main().search(new int[]{
                1, 2, 5, 8, 9
        }, 6);
        System.out.println(search);
    }

}
