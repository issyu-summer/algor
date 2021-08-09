package sort;

import java.util.Arrays;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class HeapSort {

    public static void sort(int []ar){
        //(ar.length>>1)+1 第一个非叶节点
        for (int i = (ar.length >> 1) - 1; i >=0; i--) {
            adjust(ar,i,ar.length);
        }
        //经过调整,已经变成了一个大顶堆
        for (int i = ar.length-1; i >0 ; i--) {
            //与末尾交换然后调整
            swap(ar,0,i);
            adjust(ar,0,i);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int tmp=ar[i];
        ar[i]=ar[j];
        ar[j]=tmp;
    }

    private static void adjust(int[] ar, int i, int length) {
        int tmp=ar[i];
        //左孩子,i*2+1
        for (int j = i*2+1; j < length; j=j*2+1) {
            //挑出孩子中比较大的
            if (j+1<length&&ar[j]<ar[j+1]){
                j+=1;
            }
            //将比较大的孩子赋值给父
            if(ar[j]>tmp){
                ar[i]=ar[j];
                i=j;
            }else {
                break;
            }
        }
        ar[i]=tmp;
    }

    public static void main(String[] args) {
        int []ar=new int[]{
                1,5,3,61,13,-555,151,313,1,31,231,56,8,6,5656,0
        };
        HeapSort.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
