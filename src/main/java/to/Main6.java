package to;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main6 {

    //从尾到头打印链表
    private List<Integer> list;
    public int[] reversePrint(ListNode head) {
        this.list=new ArrayList<>();
        recur(head);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void recur(ListNode head){
        if(head==null){
            return;
        }
        recur(head.next);
        list.add(head.val);
    }
}
