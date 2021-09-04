package code_top.byte_dance;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author summer
 * @see <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/">23.合并K个排序链表-hard</a><br/>
 * 优先队列+dummy
 */
public class Main23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            return null;
        }
        PriorityQueue<ListNode> queue=new PriorityQueue<>((l1,l2)->(l1.val-l2.val));
        for (ListNode head:lists) {
            if(head!=null){
                queue.add(head);
            }
        }
        ListNode dummy=new ListNode(-1),cur=dummy;
        while (!queue.isEmpty()){
            ListNode node = queue.poll();
            cur.next=node;
            cur=cur.next;
            if(node.next!=null){
                queue.add(node.next);
            }
        }
        return dummy.next;
    }
}
