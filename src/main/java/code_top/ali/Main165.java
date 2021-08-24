package code_top.ali;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main165 {

    public int compareVersion(String version1, String version2) {
        int n,m =version2.length();
        int i=0,j=0;
        char c1,c2;
        while (i<(n=version1.length())||j<m){
            int v1=0,v2=0;
            //从前向后比较
            while (i<n&&(c1=version1.charAt(i))!='.'){
                v1=10*v1+c1-'0';
                i++;
            }
            while (j<m&&(c2=version2.charAt(j))!='.'){
                v2=10*v2+c2-'0';
                j++;
            }
            if(v1!=v2){
                if(v1>v2){
                    return 1;
                }
                return -1;
            }
            //跳过分隔符
            i++;
            j++;
        }
        return 0;
    }
}
