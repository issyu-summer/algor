package uf;

import java.util.ArrayList;
import java.util.List;

/**
 * quick-union
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Uf1 {

    private int []id;
    private int count;

    public Uf1(int n){
        this.count=n;
        this.id=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
        }
    }

    /**
     * 找到连通分量的根节点
     */
    public int find(int p){
//        List<Integer> nodes=new ArrayList<>();
        while (p!=id[p]){
//            nodes.add(p);
            p=id[p];
        }
//        for (Integer node:nodes) {
//            id[node]=p;
//        }
        return p;
    }

    /**
     * quick-union:O(1)<br/>
     * 把两个节点的根节点相连,就变成了同1连通分量
     */
    public void union(int p,int q){
        int qRoot=find(q);
        int pRoot=find(p);
        if(qRoot!=pRoot){
            id[pRoot]=qRoot;
            count--;
        }
    }
}
