package uf;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入节点数:");
        int size=scanner.nextInt();
        Uf2 uf2=new Uf2(size);
        System.out.println("请输入对数:");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入两个数：");
            int p=scanner.nextInt();
            int q=scanner.nextInt();
            if(!uf2.connected(p,q)){
                uf2.union(p,q);
            }
        }
        System.out.println("连通分量数目："+uf2.count());
        System.out.println("链接情况："+ Arrays.toString(uf2.getId()));
        System.out.println("每个连通分量的大小："+ Arrays.toString(uf2.getTreeSize()));
    }
}
