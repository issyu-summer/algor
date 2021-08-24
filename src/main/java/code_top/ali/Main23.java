package code_top.ali;

import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Main23 {

    //合并K个排序链表
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> queue=new PriorityQueue<>(
                (l1,l2)->(l1.val-l2.val)
        );
        for (ListNode h:lists) {
            if(h!=null){
                queue.add(h);
            }
        }
        ListNode dummy=new ListNode(-1),cur=dummy;
        while (!queue.isEmpty()){
            ListNode node =queue.poll();
            cur.next=node;
            cur=cur.next;
            if(node.next!=null){
                queue.offer(node.next);
            }
        }
        return dummy.next;
    }

}
