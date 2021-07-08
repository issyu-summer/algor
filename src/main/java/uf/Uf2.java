package uf;

/**
 * 加权union，将小树连接到大树,仅仅访问小树的所有节点
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Uf2 {

    private int count;
    /**
     * id[0]=1,第一个点的分量是1
     */
    private int []id;
    /**
     * 各个节点所对应的分量的大小
     */
    private int [] treeSize;


    public int[] getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public int[] getTreeSize() {
        return treeSize;
    }

    public Uf2(int n){
        this.count =n;
        id=new int[n];
        treeSize=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
            treeSize[i]=1;
        }

    }



    /**
     * 在p、q间添加一条连接<br/>
     * 该归并操作会使得连通分量数-1
     */
    void union(int p,int q){
        int i=find(p);
        int j=find(q);
        if(i==j){
            return;
        }
        //将小树连接到大树
        if(treeSize[i]<treeSize[j]){
            id[i]=j;
            treeSize[j]+=treeSize[i];
        }else {
            id[j]=i;
            treeSize[i]+=treeSize[j];
        }
        count--;
    }

    /**
     * quick-find：O(1)<br/>
     * p所在连通分量
     */
    int find(int p){
        while (p!=id[p]){
            p=id[p];
        }
        return p;
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
