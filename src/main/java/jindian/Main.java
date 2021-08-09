package jindian;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {

    StringBuilder sb=new StringBuilder();
    boolean []visited=new boolean[3];
    private void dfs(int []ar,int depth){
        if(ar.length==depth){
            System.out.println(sb.toString());
            return;
        }

        for (int i = 0; i <ar.length; i++) {
            if(visited[i]){
                continue;
            }
            sb.append(ar[i]);
            visited[i]=true;
            dfs(ar,depth+1);
            sb.deleteCharAt(sb.length()-1);
            visited[i]=false;
        }
    }

    private void swap(int[]ar,int i,int j){
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }


    public static void main(String[] args) {
        new Main().dfs(new int[]{
                1,2,3
        },0);
    }
}
