package shopee;

import array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main01 {

    public int divide(int n, int k) {
        // write code here
        int[][] dp =new int[n+1][k+1];
        dp[0][0]=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=k; j++) {
                if(i>=j){
                   dp[i][j]=dp[i-j][j]+dp[i-1][j-1];
                }
            }
        }
        return dp[n][k];
    }

    public int findBalancedIndex(int[] inputArray) {
        int len=inputArray.length;
        int []l=new int[len];
        l[0]=0;
        for (int i = 1; i < len; i++) {
            l[i]=l[i-1]+inputArray[i-1];
        }
        int []r=new int[len];
        int tmp=0;
        for (int i = len-2; i >=0; i--) {
            tmp+=inputArray[i+1];
            r[i]+=tmp;
        }
        for (int i = 0; i < len; i++) {
            if(l[i]==r[i]){
                return i;
            }
        }
        return -1;
    }

    public String GetXMLValue(String inxml, String path) {
        if(inxml.equals("")){
            return "";
        }
        String s=inxml;
        int tmp = s.lastIndexOf('/');
        s=s.substring(0,tmp-1);
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        while (s.contains("<")){
            int start = s.indexOf('<');
            int end = s.indexOf('>');
            String saved=s;
            if(s.charAt(start+1)!='/') {
                String t = s.substring(start + 1, end);
                list.add(t);
            }
            s=saved;
            s=s.substring(end+1);
        }
        for (String p:list) {
            sb.append(p).append(".");
        }
        String s1 = sb.deleteCharAt(sb.length() - 1).toString();
        System.out.println(s1);
        System.out.println(path);
        if(s1.equals(path)){
            return s;
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(new Main01().GetXMLValue("<people><name>shopee</name><test>test</test></people>","people.name"));
        System.out.println(new Main01().findBalancedIndex(new int[]{
                1,2,3,4,6
        }));
        System.out.println(new Main01().divide(7,3));
    }
}
