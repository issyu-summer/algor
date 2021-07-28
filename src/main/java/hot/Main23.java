package hot;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> queue=new PriorityQueue<>(Comparator.comparingInt(l -> l.val));
        ListNode vHead=new ListNode(-1),tmp=vHead;
        for (ListNode h:lists) {
            if(h!=null) {
                queue.offer(h);
            }
        }
        while (!queue.isEmpty()){
            ListNode poll = queue.poll();
            tmp.next=poll;
            tmp=tmp.next;
            if(poll.next!=null){
                queue.offer(poll.next);
            }
        }
        return vHead.next;
    }
}
