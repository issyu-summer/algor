package uf;

/**
 * 动态连通性问题<br/>
 * quick-find<br/>
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Uf {
    private int count;
    /**
     * id[0]=1,第一个点的分量是1
     */
    private int []id;

    public Uf(int n){
        this.count =n;
        id=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
        }
    }

    /**
     * 在p、q间添加一条连接<br/>
     * 该归并操作会使得连通分量数-1
     */
    void union(int p,int q){
        if(!connected(p,q)){
            int pT=find(p);
            int qT=find(q);
            if(pT==qT){
                return;
            }
            for (int i = 0; i < count; i++) {
                if(find(i)==pT){
                    id[i]=qT;
                }
            }
            count--;
        }
    }

    /**
     * quick-find：O(1)<br/>
     * p所在连通分量
     */
    int find(int p){
        return id[p];
    }

    /**
     * p,q是否在同一分量中
     */
    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    /**
     * 连通分量的数量
     */
    public int count(){
        return count;
    }
}
